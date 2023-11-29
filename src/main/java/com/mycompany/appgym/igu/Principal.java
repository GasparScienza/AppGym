package com.mycompany.appgym.igu;


public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtAddFrec1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtAddFrec1.setText("Asociar alumno");
        jbtAddFrec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddFrec1ActionPerformed(evt);
            }
        });

        jMenuBar1.setFocusable(false);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenu1.setText("Sistema");

        jMenuItem1.setText("Agregar Alumno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Agregar Entrenamiento");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Agregar Frecuencia");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Agregar Lista de Precio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Agregar Pago");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Visualizar");

        jMenuItem6.setText("Alumnos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jbtAddFrec1)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jbtAddFrec1)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAddFrec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddFrec1ActionPerformed
        addAlEntr alEntr = new addAlEntr();
        alEntr.setVisible(true);
        alEntr.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtAddFrec1ActionPerformed
    //Agregar Alumno
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AddAlum a = new AddAlum();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    //Agregar Entrenamiento
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        addTraining tr = new addTraining();
        tr.setVisible(true);
        tr.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    //Agregar Frecuencia
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        addFrec frec = new addFrec();
        frec.setVisible(true);
        frec.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    //Agregar Lista de Precios
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        addPrice p = new addPrice();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    //Agregar Pago
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        addPago pag = new addPago();
        pag.setVisible(true);
        pag.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    //Ver alumnos
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ListAl l = new ListAl();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JButton jbtAddFrec1;
    // End of variables declaration//GEN-END:variables
}
