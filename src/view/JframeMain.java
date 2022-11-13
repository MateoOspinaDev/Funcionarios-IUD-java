package view;

import controller.CivilStateController;
import controller.FunctionaryController;
import controller.IdentificationTypeController;
import dao.CivilStateDao;
import dao.CivilStateDaoImp;
import dao.FunctionaryDao;
import dao.FunctionaryDaoImp;
import dao.IdentificationTypeDao;
import dao.IdentificationTypeDaoImp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import model.CivilState;
import model.Functionary;
import model.IdentificationType;
import utils.Messages;

public class JframeMain extends javax.swing.JFrame {

    private IdentificationTypeController identificationTypeController;
    private CivilStateController civilStateController;
    private FunctionaryController functionaryController;
    private String idUpdateFunctionary;
    
    public JframeMain() {
        initComponents();
        fillComboIdentificationType();
        fillComboCivilState();
        fillTable();
        this.jBEliminar.setEnabled(false);
        this.jBEditar.setEnabled(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }
    
    private void fillComboIdentificationType(){
        IdentificationTypeDao identificationTypeDao = new  IdentificationTypeDaoImp();
        identificationTypeController = new IdentificationTypeController(identificationTypeDao);
        JCBID.setModel(identificationTypeController.fillCombo());
    }
    
    private void fillComboCivilState(){
        CivilStateDao civilStateDao = new  CivilStateDaoImp();
        civilStateController = new CivilStateController(civilStateDao);
        jCBEstadoCivil.setModel(civilStateController.fillCombo());
    }
    
    private void fillTable(){
        FunctionaryDao functionaryDao = new  FunctionaryDaoImp();
        functionaryController = new FunctionaryController(functionaryDao);
        jTFunctionary.setModel(functionaryController.fillTable());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JCBID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTFDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCBSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDCFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jCBEstadoCivil = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADireccion = new javax.swing.JTextArea();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTFunctionary = new javax.swing.JTable();
        jBEditar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBRefrescar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestión Funcionarios");

        jLabel2.setText("Tipo ID");

        JCBID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Documento");
        jLabel3.setName("Documento"); // NOI18N

        jLabel4.setText("Nombre");

        jTFNombre.setName("Nombre"); // NOI18N
        jTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellidos");

        jTFApellido.setName("Apellido"); // NOI18N
        jTFApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFApellidoActionPerformed(evt);
            }
        });

        jLabel6.setText("Sexo");

        jCBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O", "M", "F", " " }));
        jCBSexo.setName("Sexo"); // NOI18N
        jCBSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSexoActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefono");

        jTFTelefono.setName("Telefono"); // NOI18N

        jLabel8.setText("Fecha nacimiento");

        jLabel9.setText("Estado civil");

        jCBEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBEstadoCivil.setName("Estado civil"); // NOI18N

        jLabel10.setText("Direccion");

        jTADireccion.setColumns(20);
        jTADireccion.setRows(5);
        jTADireccion.setDoubleBuffered(true);
        jScrollPane1.setViewportView(jTADireccion);

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setText("Limpiar Campos");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jTFunctionary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTFunctionary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFunctionaryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTFunctionary);

        jBEditar.setText("Editar");
        jBEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEditarMouseClicked(evt);
            }
        });
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBRefrescar.setText("Refrescar");
        jBRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRefrescarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jDCFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFApellido)
                                    .addComponent(JCBID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBEstadoCivil, 0, 160, Short.MAX_VALUE)
                            .addComponent(jTFDocumento)
                            .addComponent(jCBSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNombre)
                            .addComponent(jTFTelefono)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGuardar)
                        .addGap(18, 18, 18)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBRefrescar)
                .addGap(18, 18, 18)
                .addComponent(jBEliminar)
                .addGap(18, 18, 18)
                .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCBID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jDCFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jCBEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBNuevo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBEliminar)
                            .addComponent(jBEditar)
                            .addComponent(jBRefrescar))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBIDActionPerformed

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jTFApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFApellidoActionPerformed

    private void jCBSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSexoActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        this.cleanFields();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        if (Messages.okMessage("Editar", "¿Deseas Editar?")) {
            this.update();
            this.cleanFields();
        }
        this.fillTable();
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (Messages.okMessage("Eliminar", "¿Deseas Eliminar?")) {
            this.delete();
            this.cleanFields();
        }
        this.fillTable();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        
        if (Messages.okMessage("Salir del Sistema", "¿Seguro desea salir?")) {
            this.dispose();
        }
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if(this.jTFDocumento.getText().isBlank() || this.jTFNombre.getText().isBlank() || this.jTFApellido.getText().isBlank()){
            Messages.showMessage("Campos faltantes", "Los campos documento, nombre o apellidos están vacios",1);
        }
        else {if (this.save()) {
                System.out.println("Guardado exitoso!");
                this.fillTable();
                this.cleanFields();
        }
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTFunctionaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFunctionaryMouseClicked
        if (this.jTFunctionary.getSelectedRow() != -1) {
            this.jBEliminar.setEnabled(true);
            this.jBEditar.setEnabled(true);
            this.fillFields();
        }
    }//GEN-LAST:event_jTFunctionaryMouseClicked

    private void jBRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRefrescarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBRefrescarActionPerformed

    private void jBEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditarMouseClicked

    }//GEN-LAST:event_jBEditarMouseClicked

    private boolean save() {
        Functionary functionary = new Functionary();
        IdentificationType tipoId = new IdentificationType(this.JCBID.getSelectedIndex() + 1);
        functionary.setIdentificationType(tipoId);
        functionary.setIdentificationNumber(this.jTFDocumento.getText().trim());
        functionary.setName(this.jTFNombre.getText().trim());
        functionary.setLastName(this.jTFApellido.getText().trim());
        functionary.setSex(this.jCBSexo.getSelectedItem().toString().charAt(0));
        functionary.setPhoneNumber(this.jTFTelefono.getText());
        if (this.jDCFechaNacimiento.getDate() != null) {
            functionary.setBornDate(this.jDCFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else {
            functionary.setBornDate(LocalDate.now(ZoneId.systemDefault()));
        }

        CivilState civilState = new CivilState(this.jCBEstadoCivil.getSelectedIndex() + 1);
        functionary.setCivilState(civilState);
        functionary.setAdress(this.jTADireccion.getText().trim());
        int resultado = this.functionaryController.guardar(functionary);
        return resultado > 0;
    }
    
    private void update() {
        Functionary functionary = new Functionary();
        IdentificationType tipoId = new IdentificationType(this.JCBID.getSelectedIndex() + 1);
        functionary.setIdentificationType(tipoId);
        functionary.setIdentificationNumber(this.jTFDocumento.getText().trim());
        functionary.setName(this.jTFNombre.getText().trim());
        functionary.setLastName(this.jTFApellido.getText().trim());
        functionary.setAdress(this.jTADireccion.getText());
        functionary.setSex(this.jCBSexo.getSelectedItem().toString().charAt(0));
        functionary.setPhoneNumber(this.jTFTelefono.getText());
        if (this.jDCFechaNacimiento.getDate() != null) {
            functionary.setBornDate(this.jDCFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else {
            functionary.setBornDate(LocalDate.now(ZoneId.systemDefault()));
        }
        CivilState civilState = new CivilState(this.jCBEstadoCivil.getSelectedIndex() + 1);
        functionary.setCivilState(civilState);
        functionary.setAdress(this.jTADireccion.getText().trim());
        System.out.println(idUpdateFunctionary);
        this.functionaryController.editar(functionary,idUpdateFunctionary);
    }
    
    private void fillFields(){
        String document = (String)this.jTFunctionary.getValueAt(this.jTFunctionary.getSelectedRow(), 1);
        Functionary functionary = this.functionaryController.listarPorDocumento(document);
        this.JCBID.setSelectedIndex(functionary.getIdentificationType().getId()-1);
        this.jTFDocumento.setText(functionary.getIdentificationNumber());
        this.jTFNombre.setText(functionary.getName());
        this.jTFApellido.setText(functionary.getLastName());
        this.jTADireccion.setText(functionary.getAdress());
        this.jCBSexo.setSelectedIndex(getValidSex(functionary));
        this.jTFTelefono.setText(functionary.getPhoneNumber());
        this.jDCFechaNacimiento.setDate(Date.from(functionary.getBornDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        this.jCBEstadoCivil.setSelectedIndex(functionary.getCivilState().getId()-1);
        idUpdateFunctionary = document;
    } 
    
    private void cleanFields(){
        this.JCBID.setSelectedIndex(0);
        this.jTFDocumento.setText("");
        this.jTFNombre.setText("");
        this.jTFApellido.setText("");
        this.jTADireccion.setText("");
        this.jCBSexo.setSelectedIndex(0);
        this.jTFTelefono.setText("");
        this.jDCFechaNacimiento.setDate(null);
        this.jCBEstadoCivil.setSelectedIndex(0);
    } 
    
    private int getValidSex(Functionary functionary){
        if(functionary.getSex()=='O') return 0;
        if(functionary.getSex()=='M') return 1;
        return 2;
    }
    
    private void delete() {
        String document = (String)this.jTFunctionary.getValueAt(this.jTFunctionary.getSelectedRow(), 1);
        functionaryController.eliminar(document);
        System.out.println("Eliminado!!!!!");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JframeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBID;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBRefrescar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBEstadoCivil;
    private javax.swing.JComboBox<String> jCBSexo;
    private com.toedter.calendar.JDateChooser jDCFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTADireccion;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDocumento;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTable jTFunctionary;
    // End of variables declaration//GEN-END:variables
}
