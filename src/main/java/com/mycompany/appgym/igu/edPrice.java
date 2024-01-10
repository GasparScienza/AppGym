package com.mycompany.appgym.igu;

import com.mycompany.appgym.logica.Controladora;
import com.mycompany.appgym.logica.PriceList;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class edPrice extends javax.swing.JFrame {
    PriceList p = null;
    Controladora ctrP = new Controladora();
    
    
    public edPrice() {
        initComponents();
        this.setResizable(false);
        ctrP = new Controladora();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblFechaPago1 = new javax.swing.JLabel();
        lblFechaPago2 = new javax.swing.JLabel();
        lblFechaPago3 = new javax.swing.JLabel();
        lblFechaPago4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEntr = new javax.swing.JTextField();
        txtFrec = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CORE");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateFocusLost(evt);
            }
        });

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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

        lblFechaPago1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago1.setText("*Fecha:");

        lblFechaPago2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago2.setText("*Monto:");

        lblFechaPago3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago3.setText("Frecuencia:");

        lblFechaPago4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago4.setText("Entrenamiento:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Precio");

        txtEntr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFrec.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(lblFechaPago1)
                    .addComponent(lblFechaPago2)
                    .addComponent(lblFechaPago3)
                    .addComponent(lblFechaPago4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 171, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(txtEntr)
                    .addComponent(txtFrec, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaPago4)
                    .addComponent(txtEntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaPago3)
                    .addComponent(txtFrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaPago2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaPago1))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Boton Salir
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListPrice lp = new ListPrice();
        this.setVisible(false);
        lp.setVisible(true);
        lp.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateChooser1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1FocusLost

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        java.util.Date fechaSeleccionada = jDateChooser1.getDate();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	// Verifica si se ha seleccionado una fecha
	if (fechaSeleccionada != null) {
            String f = dateFormat.format(fechaSeleccionada);
            txtDate.setText(f);
            
	} 
    }//GEN-LAST:event_jDateChooser1PropertyChange
    void modPrecio(int idPrice) {
        p = ctrP.findPrice(idPrice);
        txtEntr.setText(p.getEn().getName());
        txtEntr.setEditable(false);
        txtFrec.setText(p.getFrec().getType());
        txtFrec.setEditable(false);
        txtAmount.setText(String.valueOf(p.getAmount()));
        
        // Crear un formato de fecha deseado
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String dateS = formatoFecha.format(p.getDate());
        txtDate.setText(dateS);
        
    }
    private void txtDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateFocusLost
        String fechaingr = txtDate.getText();
        if (fechaingr.length() == 8) {
            String formattedFecha = fechaingr.substring(0, 4) + "-" + fechaingr.substring(4, 6) + "-" + fechaingr.substring(6,8);
            txtDate.setText(formattedFecha);
	}
    }//GEN-LAST:event_txtDateFocusLost
    //Boton Aceptar
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(txtDate.getText().isEmpty() || txtAmount.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Los campos obligatorios no fueron completados");
        }else{
            String fechaIn = txtDate.getText(); 
            LocalDate fechai = LocalDate.parse(fechaIn); 
            java.sql.Date fecha = java.sql.Date.valueOf(fechai);
            
            p.setAmount(Float.parseFloat(txtAmount.getText()));
            p.setDate(fecha);
            ctrP.edPrice(p);
            this.setVisible(false);
            ListPrice lp = new ListPrice();
            lp.setVisible(true);
            lp.setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(null, "Guardado con exito");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    private void limpiarTabla() {
        txtAmount.setText("");
        txtDate.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFechaPago1;
    private javax.swing.JLabel lblFechaPago2;
    private javax.swing.JLabel lblFechaPago3;
    private javax.swing.JLabel lblFechaPago4;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEntr;
    private javax.swing.JTextField txtFrec;
    // End of variables declaration//GEN-END:variables

    

   
}
