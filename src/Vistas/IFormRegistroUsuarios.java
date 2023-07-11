
package Vistas;

import javax.swing.JOptionPane;
import modeloDAO.usuarioDAO;


public class IFormRegistroUsuarios extends javax.swing.JInternalFrame {
    usuarioDAO dao;
   
    public IFormRegistroUsuarios() {
        initComponents();
        restrictToNumbers(txtRegistroUsu);
    }

    private void restrictToNumbers(javax.swing.JTextField textField) {
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c) || textField.getText().length() >= 8) {
                    evt.consume();
                }
            }
        });
      }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtConfirmarContraseña = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        txtRegistroPas1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtRegistroUsu = new javax.swing.JFormattedTextField();
        rbtAdmin = new javax.swing.JRadioButton();
        rbtVende = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Registro");
        setMinimumSize(new java.awt.Dimension(80, 36));
        setNormalBounds(new java.awt.Rectangle(0, 0, 80, 0));
        setPreferredSize(new java.awt.Dimension(777, 546));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Usuario/Dni");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Confirmar contraseña");

        txtConfirmarContraseña.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        txtConfirmarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarContraseñaActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtRegistroPas1.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        txtRegistroPas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroPas1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña");

        txtRegistroUsu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########"))));
        txtRegistroUsu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRegistroUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroUsuActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtAdmin);
        rbtAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtAdmin.setText("Administrador");

        buttonGroup1.add(rbtVende);
        rbtVende.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtVende.setText("Vendedor");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Seleccionar tipo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("Registrar Nuevos Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConfirmarContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addComponent(rbtVende))
                            .addComponent(txtRegistroPas1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRegistroUsu))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtAdmin)
                    .addComponent(rbtVende)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistroUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRegistroPas1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarContraseñaActionPerformed
        
    }//GEN-LAST:event_txtConfirmarContraseñaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        String Usuario = txtRegistroUsu.getText();
        if (Usuario.length() != 8) {
        JOptionPane.showMessageDialog(null, "Ingresar un número de DNI válido");
             } else { 
    String usuario = txtRegistroUsu.getText();
    String contraseña = String.valueOf(txtRegistroPas1.getPassword());
    String confirmarContraseña = String.valueOf(txtConfirmarContraseña.getPassword());
    String tipo="";
    
    if (contraseña.equals(confirmarContraseña)) {
        if (rbtAdmin.isSelected()){   
        tipo="A";   
    } else {      
        if (rbtVende.isSelected()){
        tipo="V";        
        }
    }
        dao = new usuarioDAO();
        dao.registrarUsuario(usuario, contraseña, tipo);
        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
            
            //Vaciar campos y dejar el focus en el txtRegistroUsu
            txtRegistroUsu.setText("");
            txtRegistroPas1.setText("");
            txtConfirmarContraseña.setText("");
            txtRegistroUsu.requestFocus();
       
    } else {
        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
    
    }
    }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtRegistroPas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroPas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroPas1ActionPerformed

    private void txtRegistroUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroUsuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rbtAdmin;
    private javax.swing.JRadioButton rbtVende;
    private javax.swing.JPasswordField txtConfirmarContraseña;
    private javax.swing.JPasswordField txtRegistroPas1;
    private javax.swing.JFormattedTextField txtRegistroUsu;
    // End of variables declaration//GEN-END:variables
}
