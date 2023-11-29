package com.mycompany.appgym.igu;

import com.mycompany.appgym.logica.AlEntr;
import com.mycompany.appgym.logica.Alumno;
import com.mycompany.appgym.logica.Controladora;
import com.mycompany.appgym.logica.Frequency;
import com.mycompany.appgym.logica.Pago;
import com.mycompany.appgym.logica.PriceList;
import com.mycompany.appgym.logica.Training;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;



public class addPago extends javax.swing.JFrame {
    Controladora ctrP = null;
    DefaultTableModel modeloTabla = null;
    AlEntr al = null;
    Pago p = null;


    public addPago() {
        initComponents();
        this.setResizable(false);
        actTabla();
        txtMonto.disable();      
        txtAl.disable();
    }
    
    public void actTabla() {
        ctrP = new Controladora();
        this.columns(ctrP.findListAlE());
    }
    
    
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFindAl = new javax.swing.JTextField();
        jpAl = new javax.swing.JScrollPane();
        jtbAl = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblFechaPago1 = new javax.swing.JLabel();
        txtAl = new javax.swing.JTextField();
        lblFechaPago2 = new javax.swing.JLabel();
        lblFechaPago3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtFecha = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        lblFechaPago6 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alumnos");

        txtFindAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindAlActionPerformed(evt);
            }
        });

        jtbAl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbAl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbAlMouseClicked(evt);
            }
        });
        jpAl.setViewportView(jtbAl);

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(144, 144, 144))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 239, Short.MAX_VALUE)
                            .addComponent(txtFindAl, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jpAl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addComponent(txtFindAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jpAl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblFechaPago1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago1.setText("*Alumno:");

        txtAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlActionPerformed(evt);
            }
        });

        lblFechaPago2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago2.setText("*Fecha");

        lblFechaPago3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago3.setText("*Descripcion:");

        jDateChooser1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooser1FocusLost(evt);
            }
        });
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        txtFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaFocusLost(evt);
            }
        });

        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        lblFechaPago6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago6.setText("Monto:");

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaPago1)
                            .addComponent(lblFechaPago2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtAl)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaPago3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblFechaPago6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesc)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtMonto))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaPago1)
                    .addComponent(txtAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaPago2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaPago3)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaPago6))
                .addGap(121, 121, 121))
        );

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnAdd))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**    **/
    private void txtFindAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindAlActionPerformed
     
    private void jtbAlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbAlMouseClicked
        al = new AlEntr();
        //Controlar que la tabla no este vacia
        if(jtbAl.getRowCount() > 0){
            //Controlar la seleccion de alumno
            if(jtbAl.getSelectedRow()!=-1){
                //me guarda el id que esta en la columna 0 de la fila seleccionada
                int idAl = Integer.parseInt(String.valueOf(jtbAl.getValueAt(jtbAl.getSelectedRow(), 0)));
                // Obtener el objeto Alumno correspondiente a la fila seleccionada
                al = ctrP.findAlE(idAl);
            }else {
                msj("No Selecciono ningun Alumno","Error","Error");
            }
        }else {
            msj("No hay Alumnos","Error","Error");
        }
        this.txtAl.setText(al.getAlu().getSurname() + " " + al.getAlu().getName());
        calMont();
    }//GEN-LAST:event_jtbAlMouseClicked
    private void columns(ArrayList<AlEntr> lista){
	modeloTabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        //Nombres de Columnas
        String titulo[] = {"Id","Apellido","Nombre"};
        modeloTabla.setColumnIdentifiers(titulo);        
        if (lista != null) {
            for (AlEntr a : lista) {
                Object[] rowData = {a.getId(), a.getAlu().getSurname(), a.getAlu().getName()};
                modeloTabla.addRow(rowData);
            }
        }
            // Asignar el modelo de tabla actualizado a la tabla
            jtbAl.setModel(modeloTabla); 
            //Oculto la columna 0 del id de alumno para que no se vea en la pantalla
            TableColumn colum = jtbAl.getColumnModel().getColumn(0);
            colum.setMinWidth(0);
            colum.setMaxWidth(0);
            colum.setPreferredWidth(0);
            colum.setWidth(0);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlActionPerformed


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtAl.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Los campos obligatorios no fueron completados");
        }else{
            p = new Pago();                        
            
            String fechaIn = txtFecha.getText(); 
            LocalDate fechai = LocalDate.parse(fechaIn); 
            java.sql.Date fecha = java.sql.Date.valueOf(fechai);
            
            p.setAlE(al);
            p.setDate(fecha);
            p.setObs(txtDesc.getText());
            p.setMonto(Float.parseFloat(txtMonto.getText()));
            ctrP.addPago(p);
            txtAl.setText("");
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            this.actTabla();
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String letra = txtFindAl.getText().trim();
        if("".equals(letra)){
            actTabla();
        }else{
            this.columns(ctrP.findAlELetra(letra));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jDateChooser1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1FocusLost

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        java.util.Date fechaSeleccionada = jDateChooser1.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Verifica si se ha seleccionado una fecha
        if (fechaSeleccionada != null) {
            String f = dateFormat.format(fechaSeleccionada);
            txtFecha.setText(f);

        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void txtFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFocusLost
        String fechaingr = txtFecha.getText();
        if (fechaingr.length() == 8) {
            String formattedFecha = fechaingr.substring(0, 4) + "-" + fechaingr.substring(4, 6) + "-" + fechaingr.substring(6,8);
            txtFecha.setText(formattedFecha);
        }
    }//GEN-LAST:event_txtFechaFocusLost
    public void calMont(){      
        p = new Pago();
            
        p.setAlE(al);
        p.calMontoPPago(al);
        txtMonto.setText(String.valueOf(p.getMonto()));
    }
    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed

    }//GEN-LAST:event_txtMontoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jpAl;
    private javax.swing.JTable jtbAl;
    private javax.swing.JLabel lblFechaPago1;
    private javax.swing.JLabel lblFechaPago2;
    private javax.swing.JLabel lblFechaPago3;
    private javax.swing.JLabel lblFechaPago6;
    private javax.swing.JTextField txtAl;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFindAl;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
