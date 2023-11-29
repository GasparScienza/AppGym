package com.mycompany.appgym.igu;

import com.mycompany.appgym.logica.AlEntr;
import com.mycompany.appgym.logica.Alumno;
import com.mycompany.appgym.logica.Controladora;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ListAl extends javax.swing.JFrame {
    Controladora ctrP = null;
    AlEntr alu = null;
    public ListAl() {
        initComponents();
        ctrP = new Controladora();
        actTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAlumnos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbAlumnos = new javax.swing.JTable();
        btnDelAlumno = new javax.swing.JButton();
        btnBuscarAl = new javax.swing.JButton();
        txtBuscAl = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnVolverP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AyM Gym");

        lblAlumnos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlumnos.setText("Alumnos");

        jtbAlumnos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbAlumnos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtbAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbAlumnosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtbAlumnos);

        btnDelAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelAlumno.setText("Dar de baja");
        btnDelAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelAlumnoActionPerformed(evt);
            }
        });

        btnBuscarAl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscarAl.setText("Buscar");
        btnBuscarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlActionPerformed(evt);
            }
        });

        txtBuscAl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Ver Historial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolverP)
                        .addGap(0, 633, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addComponent(lblAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelAlumno)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarAl)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscAl, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverP)
                .addGap(3, 3, 3)
                .addComponent(lblAlumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAl)
                    .addComponent(btnDelAlumno)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void limpiarTabla() {
	txtBuscAl.setText("");
    }
    public void actTabla() {
	DefaultTableModel modeloTabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        //Nombres de Columnas
        String titulo[] = {"Id","Apellido","Nombre", "Observacion", "Fecha Ingreso"};
        modeloTabla.setColumnIdentifiers(titulo);
           
	ArrayList<AlEntr> Lista = ctrP.findListAlE();
        if(Lista!=null){ 
            for(AlEntr a:Lista) {
                if(a.isBaja()!= true){
                    Object[] rowData = {a.getId(), a.getAlu().getSurname(), a.getAlu().getName(),  a.getAlu().getObs(), dateFormat.format(a.getAlu().getDate())};
                    modeloTabla.addRow(rowData);
                }  
            }  
        }     
	jtbAlumnos.setModel(modeloTabla);
        
        //Oculto la columna 0 del id de alumno para que no se vea en la pantalla
        TableColumn colum = jtbAlumnos.getColumnModel().getColumn(0);
        colum.setMinWidth(0);
        colum.setMaxWidth(0);
        colum.setPreferredWidth(0);
        colum.setWidth(0);   
    }
    private void jtbAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbAlumnosMouseClicked
        

    }//GEN-LAST:event_jtbAlumnosMouseClicked

    private void btnDelAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelAlumnoActionPerformed
        /**

        //Controlar que la tabla no este vacia
        if(jtbAlumnos.getRowCount() > 0){
            //Controlar la seleccion de alumno
            if(jtbAlumnos.getSelectedRow()!=-1){
                //me guarda el id que esta en la columna 0 de la fila seleccionada
                int idAl = Integer.parseInt(String.valueOf(jtbAlumnos.getValueAt(jtbAlumnos.getSelectedRow(), 0)));
                
                int m = JOptionPane.showConfirmDialog(null, "Estas seguro?","Baja Alumno",DO_NOTHING_ON_CLOSE);
                if(m==0){
                    alu = ctrP.findAlumno(idAl);
                    
                    alu.setAssociate(true);
                    ctrP.edAl(alu);
                    limpiarTabla();
                    actTabla();
                    msj("El alumno " + alu.getSurname()+ " " +alu.getName()+ " fue dado de baja","Info","Baja Alumno");
                }
            }else {
                msj("No Selecciono ningun Alumno","Error","Error");
            }
        }else {
            msj("No hay Alumnos","Error","Error");
        }
        **/
    }//GEN-LAST:event_btnDelAlumnoActionPerformed

    private void btnBuscarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlActionPerformed
        String letra = txtBuscAl.getText().trim();

        if(letra == ""){
            actTabla();
        }else{
            DefaultTableModel modeloTabla = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            //Nombres de Columnas
            String titulo[] = {"Id","Apellido","Nombre", "Observacion", "Fecha Ingreso"};
            modeloTabla.setColumnIdentifiers(titulo);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            ArrayList<Alumno> lista = ctrP.findAlLetra(letra);

            if (lista != null) {
                for (Alumno a : lista) {
                    if(a.isAssociate()== true){
                        Object[] rowData = {a.getId(), a.getSurname(), a.getName(),  a.getObs(), dateFormat.format(a.getDate())};
                        modeloTabla.addRow(rowData);
                    }
                }
            }

            // Asignar el modelo de tabla actualizado a tu tabla
            jtbAlumnos.setModel(modeloTabla); // Reemplaza 'tuTabla' con el nombre de tu tabla

            //Oculto la columna 0 del id de alumno para que no se vea en la pantalla
            TableColumn colum = jtbAlumnos.getColumnModel().getColumn(0);
            colum.setMinWidth(0);
            colum.setMaxWidth(0);
            colum.setPreferredWidth(0);
            colum.setWidth(0);
        }
    }//GEN-LAST:event_btnBuscarAlActionPerformed
//Boton Ver historial alumno
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        alu = new AlEntr();
        //Controlar que la tabla no este vacia
        if(jtbAlumnos.getRowCount() > 0){
            //Controlar la seleccion de alumno
            if(jtbAlumnos.getSelectedRow()!=-1){
                InfoAlumno infAl = new InfoAlumno();
                infAl.setVisible(true);
                infAl.setLocationRelativeTo(null);
                //me guarda el id que esta en la columna 0 de la fila seleccionada
                int idAl = Integer.parseInt(String.valueOf(jtbAlumnos.getValueAt(jtbAlumnos.getSelectedRow(), 0)));
                // Obtener el objeto Alumno correspondiente a la fila seleccionada

                infAl.actTabla(idAl);
            }else {
                msj("No Selecciono ningun Alumno","Error","Error");
            }
        }else {
            msj("No hay Alumnos","Error","Error");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton btnBuscarAl;
    private javax.swing.JButton btnDelAlumno;
    private javax.swing.JButton btnVolverP;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtbAlumnos;
    private javax.swing.JLabel lblAlumnos;
    private javax.swing.JTextField txtBuscAl;
    // End of variables declaration//GEN-END:variables
}
