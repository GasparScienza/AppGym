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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jbtAddAlum)
                .addGap(18, 18, 18)
                .addComponent(jbtAddEntr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtAddFrec)
                .addGap(18, 18, 18)
                .addComponent(jbtAddFrec1)
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
                .addContainerGap(372, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtAddAlum;
    private javax.swing.JButton jbtAddEntr;
    private javax.swing.JButton jbtAddFrec;
    private javax.swing.JButton jbtAddFrec1;
    // End of variables declaration//GEN-END:variables
}
