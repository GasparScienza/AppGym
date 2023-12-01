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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class addAlEntr extends javax.swing.JFrame {
    Controladora ctrP = null;
    DefaultTableModel modeloTabla = null;
    Alumno alu = null;
    Pago p = null;
    AlEntr alE = null;
    
    public addAlEntr() {
        initComponents();
        this.setResizable(false);
        actTabla();
        configurarComboBox();
        txtMonto.disable();
        txtAl.disable();
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
        jPanel2 = new javax.swing.JPanel();
        lblFechaPago1 = new javax.swing.JLabel();
        txtAl = new javax.swing.JTextField();
        lblFechaPago2 = new javax.swing.JLabel();
        lblFechaPago3 = new javax.swing.JLabel();
        cbmTraining = new javax.swing.JComboBox<>();
        cbmFreq = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblFechaPago4 = new javax.swing.JLabel();
        lblFechaPago5 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        lblFechaPago6 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CORE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alumnos");

        jbtFind.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtFind.setText("Buscar");
        jbtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFindActionPerformed(evt);
            }
        });

        txtFindAl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFindAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindAlActionPerformed(evt);
            }
        });

        jpAl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jtbAl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
            .addGap(0, 385, Short.MAX_VALUE)
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
            .addGap(0, 363, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtFind)
                        .addComponent(txtFindAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jpAl, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        lblFechaPago1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago1.setText("*Alumno:");

        txtAl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlActionPerformed(evt);
            }
        });

        lblFechaPago2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago2.setText("*Entrenamiento:");

        lblFechaPago3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago3.setText("*Frecuencia:");

        cbmTraining.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbmTraining.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmTrainingItemStateChanged(evt);
            }
        });
        cbmTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmTrainingActionPerformed(evt);
            }
        });

        cbmFreq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbmFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmFreqActionPerformed(evt);
            }
        });

        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaFocusLost(evt);
            }
        });

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

        lblFechaPago4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago4.setText("*Fecha");

        lblFechaPago5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago5.setText("Descripcion:");

        txtDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        lblFechaPago6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaPago6.setText("Monto:");

        txtMonto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblFechaPago6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaPago5)
                            .addComponent(lblFechaPago4)
                            .addComponent(lblFechaPago3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbmFreq, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDesc)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaPago2)
                            .addComponent(lblFechaPago1))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbmTraining, 0, 175, Short.MAX_VALUE)
                            .addComponent(txtAl))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaPago1)
                    .addComponent(txtAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmTraining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaPago2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaPago3)
                    .addComponent(cbmFreq))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaPago4)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaPago5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaPago6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Salir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 632, Short.MAX_VALUE)
                        .addComponent(btnAdd)))
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(423, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(btnAdd))
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
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
        calMont();
    }//GEN-LAST:event_jtbAlMouseClicked

    private void txtAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlActionPerformed

    private void cbmTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmTrainingActionPerformed
        calMont();
    }//GEN-LAST:event_cbmTrainingActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtAl.getText().isEmpty() || txtFecha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Los campos obligatorios no fueron completados");
        }else{         
            String fechaIn = txtFecha.getText(); 
            LocalDate fechai = LocalDate.parse(fechaIn); 
            java.sql.Date fecha = java.sql.Date.valueOf(fechai);
            
            alu.setAssociate(true);
            alE.setAlu(alu);
            alE.setBaja(false);
            
            p.setDate(fecha);
            p.setObs(txtDesc.getText());
            
            ctrP.edAl(alu);
            ctrP.addAlE(alE);
            ctrP.addPago(p);
            
            txtAl.setText("");
            txtFecha.setText("");
            txtDesc.setText("");
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            this.actTabla();
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFocusLost
        String fechaingr = txtFecha.getText();
        if (fechaingr.length() == 8) {
            String formattedFecha = fechaingr.substring(0, 4) + "-" + fechaingr.substring(4, 6) + "-" + fechaingr.substring(6,8);
            txtFecha.setText(formattedFecha);
        }
    }//GEN-LAST:event_txtFechaFocusLost

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
    
    public void calMont(){      
        alE = new AlEntr();
        p = new Pago();
        Training entr = this.nameEntr();
        alE.setEntr(entr);
        Frequency frec = this.nameFrec();
        alE.setFrec(frec);
            
        p.setAlE(alE);
        p.calMontoPPago(alE);
        txtMonto.setText(String.valueOf(p.getMonto()));
    }
    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescActionPerformed

    private void cbmFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmFreqActionPerformed
        calMont();
    }//GEN-LAST:event_cbmFreqActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        
    }//GEN-LAST:event_txtMontoActionPerformed

    private void cbmTrainingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmTrainingItemStateChanged
        
    }//GEN-LAST:event_cbmTrainingItemStateChanged
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
            
        // Centra los valores en todas las celdas de la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jtbAl.getColumnCount(); i++) {
            jtbAl.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    
    private Training nameEntr(){
        String nombreSeleccionado = (String) cbmTraining.getSelectedItem();
        return mapEntrenamientos.get(nombreSeleccionado);
    }
    private Frequency nameFrec(){
        String nombreSeleccionado = (String) cbmFreq.getSelectedItem();
        return mapFrec.get(nombreSeleccionado);
    }
   
    private Map<String, Training> mapEntrenamientos = new HashMap<>();
    private Map<String, Frequency> mapFrec = new HashMap<>();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cbmFreq;
    private javax.swing.JComboBox<String> cbmTraining;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtFind;
    private javax.swing.JScrollPane jpAl;
    private javax.swing.JTable jtbAl;
    private javax.swing.JLabel lblFechaPago1;
    private javax.swing.JLabel lblFechaPago2;
    private javax.swing.JLabel lblFechaPago3;
    private javax.swing.JLabel lblFechaPago4;
    private javax.swing.JLabel lblFechaPago5;
    private javax.swing.JLabel lblFechaPago6;
    private javax.swing.JTextField txtAl;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFindAl;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
