
package com.mycompany.appgym.igu;

import com.mycompany.appgym.logica.AlEntr;
import com.mycompany.appgym.logica.Alumno;
import com.mycompany.appgym.logica.Controladora;
import com.mycompany.appgym.logica.Pago;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class InfoAlumno extends javax.swing.JFrame {
    Controladora ctrP = null;
    AlEntr al = null;
    
    public InfoAlumno() {
        initComponents();
        ctrP = new Controladora();
    }

    public void actTabla(int id) {
        al = new AlEntr();
        float tot = 0;
	DefaultTableModel modeloTabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //Nombres de Columnas
        String titulo[] = {"Id","Fecha","Monto", "Observacion"};
        modeloTabla.setColumnIdentifiers(titulo);
        al = ctrP.findAlE(id);
        
	ArrayList<Pago> Lista = ctrP.findPagoEntities(al);
        if(Lista!=null){ 
            for(Pago p:Lista) {
                Object[] rowData = {p.getId(), dateFormat.format(p.getDate()),p.getMonto() ,p.getObs()};
                modeloTabla.addRow(rowData);
                //tot += p.getMonto();
            }
        }  
        
        txtNombreInfo.setText(al.getAlu().getName());
        txtNombreInfo.setEditable(false);
        txtApellidoInfo.setText(al.getAlu().getSurname());
        txtApellidoInfo.setEditable(false);
	tblInfoAl.setModel(modeloTabla);
        
        //Oculto la columna 0 del id de alumno para que no se vea en la pantalla
        TableColumn colum = tblInfoAl.getColumnModel().getColumn(0);
        colum.setMinWidth(0);
        colum.setMaxWidth(0);
        colum.setPreferredWidth(0);
        colum.setWidth(0); 
        
        // Centra los valores en todas las celdas de la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tblInfoAl.getColumnCount(); i++) {
            tblInfoAl.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInfoAl = new javax.swing.JTable();
        txtNombreInfo = new javax.swing.JTextField();
        txtApellidoInfo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVolverP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CORE");
        setResizable(false);

        tblInfoAl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblInfoAl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblInfoAl);

        txtNombreInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtApellidoInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Apellido:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Historial de Pago ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnVolverP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVolverP.setText("Volver");
        btnVolverP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVolverP)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtApellidoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnVolverP)
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverPActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverPActionPerformed
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
    private javax.swing.JButton btnVolverP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInfoAl;
    private javax.swing.JTextField txtApellidoInfo;
    private javax.swing.JTextField txtNombreInfo;
    // End of variables declaration//GEN-END:variables
}
