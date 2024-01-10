package com.mycompany.appgym.igu;

import com.mycompany.appgym.logica.AlEntr;
import com.mycompany.appgym.logica.Controladora;
import com.mycompany.appgym.logica.PriceList;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ListPrice extends javax.swing.JFrame {
    Controladora ctrP = null;
    public ListPrice() {
        initComponents();
        ctrP = new Controladora();
        actTabla();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAlumnos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbPrices = new javax.swing.JTable();
        btnVolverP = new javax.swing.JButton();
        btnModP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CORE");

        lblAlumnos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlumnos.setText("Lista de Precios");

        jtbPrices.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbPrices.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtbPrices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbPrices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbPricesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtbPrices);

        btnVolverP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVolverP.setText("Volver");
        btnVolverP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverPActionPerformed(evt);
            }
        });

        btnModP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModP.setText("Modificar");
        btnModP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModP)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVolverP)
                                .addGap(0, 613, Short.MAX_VALUE))
                            .addComponent(jScrollPane3)
                            .addComponent(lblAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnVolverP)
                .addGap(3, 3, 3)
                .addComponent(lblAlumnos)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnModP)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void actTabla() {
	DefaultTableModel modeloTabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        //Nombres de Columnas
        String titulo[] = {"Id","Entrenamiento","Frecuencia", "Monto", "Fecha"};
        modeloTabla.setColumnIdentifiers(titulo);
          //dateFormat.format(a.getAlu().getDate()) 
	ArrayList<PriceList> Lista = ctrP.findListPrice();
        if(Lista!=null){ 
            for(PriceList price:Lista) {
                Object[] rowData = {price.getId(), price.getEn().getName(), price.getFrec().getType(), price.getAmount(), dateFormat.format(price.getDate())};
                modeloTabla.addRow(rowData); 
            }  
        }     
	jtbPrices.setModel(modeloTabla);
        
        //Oculto la columna 0 del id de alumno para que no se vea en la pantalla
        TableColumn colum = jtbPrices.getColumnModel().getColumn(0);
        colum.setMinWidth(0);
        colum.setMaxWidth(0);
        colum.setPreferredWidth(0);
        colum.setWidth(0);  
        
        // Centra los valores en todas las celdas de la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jtbPrices.getColumnCount(); i++) {
        jtbPrices.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    private void jtbPricesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbPricesMouseClicked
        

    }//GEN-LAST:event_jtbPricesMouseClicked

    private void btnVolverPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverPActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverPActionPerformed
    //Boton modificar Precio
    private void btnModPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModPActionPerformed
        //Controlar que la tabla no este vacia
        if(jtbPrices.getRowCount() > 0){
            //Controlar la seleccion de alumno
            if(jtbPrices.getSelectedRow()!=-1){
                //me guarda el id que esta en la columna 0 de la fila seleccionada
                int idPrice = Integer.parseInt(String.valueOf(jtbPrices.getValueAt(jtbPrices.getSelectedRow(), 0)));
                // Obtener el objeto Alumno correspondiente a la fila seleccionada
                edPrice edPrice = new edPrice();
                edPrice.setVisible(true);
                edPrice.setLocationRelativeTo(null);
                edPrice.modPrecio(idPrice);
                this.setVisible(false);
            }else {
                msj("No Selecciono ningun Alumno","Error","Error");
            }
        }else {
            msj("No hay Alumnos","Error","Error");
        }   
    }//GEN-LAST:event_btnModPActionPerformed
       
    public void msj(String mensaje, String tipo, String titulo){
        JOptionPane optPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")){
            optPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (tipo.equals("Error")){
            optPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModP;
    private javax.swing.JButton btnVolverP;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtbPrices;
    private javax.swing.JLabel lblAlumnos;
    // End of variables declaration//GEN-END:variables
}
