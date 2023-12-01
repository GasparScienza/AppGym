package com.mycompany.appgym.igu;

import com.mycompany.appgym.logica.Controladora;
import com.mycompany.appgym.logica.Frequency;
import com.mycompany.appgym.logica.Training;
import javax.swing.JOptionPane;


public class addTraining extends javax.swing.JFrame {
    Controladora ctrP = null;

    public addTraining() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtTrDesc = new javax.swing.JTextField();
        txtTrName = new javax.swing.JTextField();
        lblFechaPago4 = new javax.swing.JLabel();
        lblFechaPago5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CORE");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtTrDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTrName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrNameActionPerformed(evt);
            }
        });

        lblFechaPago4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago4.setText("*Nombre:");

        lblFechaPago5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago5.setText("*Descripcion:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Entrenamiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaPago4)
                            .addComponent(lblFechaPago5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTrName)
                            .addComponent(txtTrDesc))))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaPago4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaPago5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Training tr = new Training();
        ctrP = new Controladora();
        if(txtTrName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El nombre del entrenamiento no fue completado");
        }else{
            tr.setName(txtTrName.getText());
            tr.setDescr(txtTrDesc.getText());

            ctrP.addTr(tr);
            this.txtTrDesc.setText("");
            this.txtTrName.setText("");
            JOptionPane.showMessageDialog(null, "Guardado con exito");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFechaPago4;
    private javax.swing.JLabel lblFechaPago5;
    private javax.swing.JTextField txtTrDesc;
    private javax.swing.JTextField txtTrName;
    // End of variables declaration//GEN-END:variables
}
