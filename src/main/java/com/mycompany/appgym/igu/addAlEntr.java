package com.mycompany.appgym.igu;

import com.mycompany.appgym.logica.AlEntr;
import com.mycompany.appgym.logica.Alumno;
import com.mycompany.appgym.logica.Controladora;
import com.mycompany.appgym.logica.Frequency;
import com.mycompany.appgym.logica.Training;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;



public class addAlEntr extends javax.swing.JFrame {
    Controladora ctrP = null;
    DefaultTableModel modeloTabla = null;
    Alumno alu = null;


    public addAlEntr() {
        initComponents();
        actTabla();
        configurarComboBox();
    }
    private void configurarComboBox() {
        // Método para cargar la lista de entrenamientos en el ComboBox
        List<Training> listaEntrenamientos = ctrP.findListTr();

        for (Training entrenamiento : listaEntrenamientos) {
            String nombreEntrenamiento = entrenamiento.getName();
            cbmTraining.addItem(nombreEntrenamiento);
            mapEntrenamientos.put(nombreEntrenamiento, entrenamiento);
        }
        
        List<Frequency> listFrec = ctrP.findListFreq();
        
        for (Frequency frec : listFrec) {
            String nameFrec = frec.getType();
            cbmFreq.addItem(nameFrec);
            mapFrec.put(nameFrec, frec);
        }
    }
    public void actTabla() {
        ctrP = new Controladora();
        this.columns(ctrP.findListAlumno());
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
        jbtFind = new javax.swing.JButton();
        txtFindAl = new javax.swing.JTextField();
        jpAl = new javax.swing.JScrollPane();
        jtbAl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblFechaPago1 = new javax.swing.JLabel();
        txtAl = new javax.swing.JTextField();
        lblFechaPago2 = new javax.swing.JLabel();
        lblFechaPago3 = new javax.swing.JLabel();
        cbmTraining = new javax.swing.JComboBox<>();
        cbmFreq = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();

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
            .addGap(0, 0, Short.MAX_VALUE)
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

        lblFechaPago1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago1.setText("*Alumno:");

        txtAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlActionPerformed(evt);
            }
        });

        lblFechaPago2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago2.setText("*Entrenamiento:");

        lblFechaPago3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago3.setText("*Frecuencia:");

        cbmTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmTrainingActionPerformed(evt);
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
                        .addComponent(lblFechaPago1)
                        .addGap(18, 18, 18)
                        .addComponent(txtAl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblFechaPago2)
                        .addGap(18, 18, 18)
                        .addComponent(cbmTraining, 0, 139, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblFechaPago3)
                        .addGap(18, 18, 18)
                        .addComponent(cbmFreq, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbmTraining, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(lblFechaPago2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaPago3)
                    .addComponent(cbmFreq, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(163, 163, 163))
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd)))
                .addContainerGap())
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
        alu = new Alumno();
        //Controlar que la tabla no este vacia
        if(jtbAl.getRowCount() > 0){
            //Controlar la seleccion de alumno
            if(jtbAl.getSelectedRow()!=-1){
                //me guarda el id que esta en la columna 0 de la fila seleccionada
                int idAl = Integer.parseInt(String.valueOf(jtbAl.getValueAt(jtbAl.getSelectedRow(), 0)));
                // Obtener el objeto Alumno correspondiente a la fila seleccionada
                alu = ctrP.findAlumno(idAl);
                //alu.setId(idAl);
            }else {
                msj("No Selecciono ningun Alumno","Error","Error");
            }
        }else {
            msj("No hay Alumnos","Error","Error");
        }
        this.txtAl.setText(alu.getSurname() + " " + alu.getName());
    }//GEN-LAST:event_jtbAlMouseClicked
    private void columns(ArrayList<Alumno> lista){
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
                if(!a.isAssociate()){
                    Object[] rowData = {a.getId(), a.getSurname(), a.getName()};
                    modeloTabla.addRow(rowData);
                }
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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlActionPerformed

    private Training nameEntr(){
        String nombreSeleccionado = (String) cbmTraining.getSelectedItem();
        return mapEntrenamientos.get(nombreSeleccionado);
    }
    private Frequency nameFrec(){
        String nombreSeleccionado = (String) cbmFreq.getSelectedItem();
        return mapFrec.get(nombreSeleccionado);
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtAl.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Los campos obligatorios no fueron completados");
        }else{
            AlEntr alE = new AlEntr();
            alE.setAlu(alu);
            
            alu.setAssociate(true);
            ctrP.edAl(alu);
            alE.setBaja(false);
            Training entr = this.nameEntr();
            alE.setEntr(entr);
            Frequency frec = this.nameFrec();
            alE.setFrec(frec);
            ctrP.addAlE(alE);
            txtAl.setText("");
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            this.actTabla();
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void cbmTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmTrainingActionPerformed

    }//GEN-LAST:event_cbmTrainingActionPerformed
    private Map<String, Training> mapEntrenamientos = new HashMap<>();
    private Map<String, Frequency> mapFrec = new HashMap<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cbmFreq;
    private javax.swing.JComboBox<String> cbmTraining;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtFind;
    private javax.swing.JScrollPane jpAl;
    private javax.swing.JTable jtbAl;
    private javax.swing.JLabel lblFechaPago1;
    private javax.swing.JLabel lblFechaPago2;
    private javax.swing.JLabel lblFechaPago3;
    private javax.swing.JTextField txtAl;
    private javax.swing.JTextField txtFindAl;
    // End of variables declaration//GEN-END:variables
}
