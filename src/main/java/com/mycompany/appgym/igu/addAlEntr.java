package com.mycompany.appgym.igu;

import com.mycompany.appgym.logica.Alumno;
import com.mycompany.appgym.logica.Controladora;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class addAlEntr extends javax.swing.JFrame {
    Controladora ctrP = null;
    DefaultTableModel modeloTabla = null;
    
    public addAlEntr() {
        initComponents();
        actTabla();
    }
    public void actTabla() {
        ctrP = new Controladora();
        this.columns(ctrP.findListAlumno());
    }
    public void columns(ArrayList<Alumno> lista){
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
            for (Alumno a : lista) {
                Object[] rowData = {a.getId(), a.getSurname(), a.getName()};
                modeloTabla.addRow(rowData);
            }
        }
            // Asignar el modelo de tabla actualizado a tu tabla
            jtbAl.setModel(modeloTabla); // Reemplaza 'tuTabla' con el nombre de tu tabla
            //Oculto la columna 0 del id de alumno para que no se vea en la pantalla
            TableColumn colum = jtbAl.getColumnModel().getColumn(0);
            colum.setMinWidth(0);
            colum.setMaxWidth(0);
            colum.setPreferredWidth(0);
            colum.setWidth(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbtFind = new javax.swing.JButton();
        txtFindAl = new javax.swing.JTextField();
        jpAl = new javax.swing.JScrollPane();
        jtbAl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alumnos");

        jbtFind.setText("Buscar");
        jbtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFindActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 149, Short.MAX_VALUE)
                            .addComponent(jbtFind)
                            .addGap(18, 18, 18)
                            .addComponent(txtFindAl, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jpAl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtFind)
                        .addComponent(txtFindAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(408, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jbtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFindActionPerformed
        String letra = txtFindAl.getText().trim();
        if("".equals(letra)){
            actTabla();
        }else{
            this.columns(ctrP.findAlLetra(letra));
        }
    }//GEN-LAST:event_jbtFindActionPerformed
    
    
    private void txtFindAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindAlActionPerformed
    
    
    private void jtbAlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbAlMouseClicked
        /**
        alu = new Alumno();

        //Controlar que la tabla no este vacia
        if(jtbAlPago.getRowCount() > 0){
            //Controlar la seleccion de alumno
            if(jtbAlPago.getSelectedRow()!=-1){
                //me guarda el id que esta en la columna 0 de la fila seleccionada
                int idAl = Integer.parseInt(String.valueOf(jtbAlPago.getValueAt(jtbAlPago.getSelectedRow(), 0)));
                // Obtener el objeto Alumno correspondiente a la fila seleccionada
                alu = ctr.findAlumno(idAl);
                //alu.setId(idAl);
            }else {
                msj("No Selecciono ningun Alumno","Error","Error");
            }
        }else {
            msj("No hay Alumnos","Error","Error");
        }

        this.txtAlumno.setText(alu.getApellido() + " " + alu.getNombre());
        **/
    }//GEN-LAST:event_jtbAlMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtFind;
    private javax.swing.JScrollPane jpAl;
    private javax.swing.JTable jtbAl;
    private javax.swing.JTextField txtFindAl;
    // End of variables declaration//GEN-END:variables
}
