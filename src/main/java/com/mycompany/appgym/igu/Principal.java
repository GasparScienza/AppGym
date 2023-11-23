package com.mycompany.appgym.igu;


public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtAddAlum = new javax.swing.JButton();
        jbtAddEntr = new javax.swing.JButton();
        jbtAddFrec = new javax.swing.JButton();
        jbtAddFrec1 = new javax.swing.JButton();
        jbtAddFrec2 = new javax.swing.JButton();
        jbtAddFrec3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtAddAlum.setText("Agregar Alumno");
        jbtAddAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddAlumActionPerformed(evt);
            }
        });

        jbtAddEntr.setText("Agregar Entrenamiento");
        jbtAddEntr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddEntrActionPerformed(evt);
            }
        });

        jbtAddFrec.setText("Agregar Frecuencia");
        jbtAddFrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddFrecActionPerformed(evt);
            }
        });

        jbtAddFrec1.setText("Asociar alumno");
        jbtAddFrec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddFrec1ActionPerformed(evt);
            }
        });

        jbtAddFrec2.setText("Lista de Precios");
        jbtAddFrec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddFrec2ActionPerformed(evt);
            }
        });

        jbtAddFrec3.setText("Pago");
        jbtAddFrec3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddFrec3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtAddAlum)
                    .addComponent(jbtAddFrec2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtAddEntr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtAddFrec)
                        .addGap(18, 18, 18)
                        .addComponent(jbtAddFrec1))
                    .addComponent(jbtAddFrec3))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAddAlum)
                    .addComponent(jbtAddEntr)
                    .addComponent(jbtAddFrec)
                    .addComponent(jbtAddFrec1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAddFrec2)
                    .addComponent(jbtAddFrec3))
                .addContainerGap(331, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAddFrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddFrecActionPerformed
        addFrec frec = new addFrec();
        frec.setVisible(true);
        frec.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jbtAddFrecActionPerformed

    private void jbtAddFrec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddFrec1ActionPerformed
        addAlEntr alEntr = new addAlEntr();
        alEntr.setVisible(true);
        alEntr.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtAddFrec1ActionPerformed

    private void jbtAddAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddAlumActionPerformed
        AddAlum a = new AddAlum();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtAddAlumActionPerformed

    private void jbtAddEntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddEntrActionPerformed
        addTraining tr = new addTraining();
        tr.setVisible(true);
        tr.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtAddEntrActionPerformed

    private void jbtAddFrec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddFrec2ActionPerformed
        addPrice p = new addPrice();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtAddFrec2ActionPerformed

    private void jbtAddFrec3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddFrec3ActionPerformed
        addPago pag = new addPago();
        pag.setVisible(true);
        pag.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtAddFrec3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtAddAlum;
    private javax.swing.JButton jbtAddEntr;
    private javax.swing.JButton jbtAddFrec;
    private javax.swing.JButton jbtAddFrec1;
    private javax.swing.JButton jbtAddFrec2;
    private javax.swing.JButton jbtAddFrec3;
    // End of variables declaration//GEN-END:variables
}
