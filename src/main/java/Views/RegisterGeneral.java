/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Models.Sucursal;
import Models.User;
import Utilities.Paths;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import static Utilities.Paths.SUCURSAL_FILE;
import static Utilities.Paths.USER_FILE;

/**
 *
 * @author hfyh
 */
public class RegisterGeneral extends javax.swing.JFrame {

    /**
     * Creates new form RegisterGeneral
     */
    private ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
    private ArrayList<User> users = new ArrayList<User>();
    private User admin;

    
    
    public RegisterGeneral(User admin) {
        this.admin = admin;
        initComponents();
        panelImage1.setIcon(new ImageIcon(Paths.PONY_LOGO));
        setLocationRelativeTo(null);
        lblError.setVisible(false);
    }
    public RegisterGeneral() {
        initComponents();
        setLocationRelativeTo(null);
        panelImage1.setIcon(new ImageIcon(Paths.PONY_LOGO));
        lblError.setVisible(false);
        
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
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        fieldPassword = new javax.swing.JPasswordField();
        btnTheme = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldPhone = new javax.swing.JTextField();
        sucursalSelector = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userTypeSelector = new javax.swing.JComboBox<>();
        lblError = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldRepeatPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 250, 250));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 180, -1));

        fieldName.setBackground(new java.awt.Color(255, 255, 255));
        fieldName.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldName.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 170, -1));

        btnRegister.setBackground(new java.awt.Color(51, 51, 255));
        btnRegister.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Registrar");
        btnRegister.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 120, 40));

        btnCancel.setBackground(new java.awt.Color(255, 102, 102));
        btnCancel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 120, 40));

        fieldPassword.setBackground(new java.awt.Color(255, 255, 255));
        fieldPassword.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldPassword.setForeground(new java.awt.Color(0, 0, 0));
        fieldPassword.setToolTipText("");
        jPanel1.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 190, 30));

        btnTheme.setBackground(new java.awt.Color(245, 245, 249));
        btnTheme.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemeActionPerformed(evt);
            }
        });
        jPanel1.add(btnTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 40, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre de usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 180, -1));

        fieldUsername.setBackground(new java.awt.Color(255, 255, 255));
        fieldUsername.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldUsername.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 180, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sucursal");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 190, -1));

        fieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        fieldEmail.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldEmail.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(fieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 180, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 190, -1));

        fieldPhone.setBackground(new java.awt.Color(255, 255, 255));
        fieldPhone.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldPhone.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(fieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 190, 30));

        sucursalSelector.setBackground(new java.awt.Color(255, 255, 255));
        sucursalSelector.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        sucursalSelector.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(sucursalSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 190, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 180, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tipo de usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 190, -1));

        userTypeSelector.setBackground(new java.awt.Color(255, 255, 255));
        userTypeSelector.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        userTypeSelector.setForeground(new java.awt.Color(0, 0, 0));
        userTypeSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Cliente", "Vendedor" }));
        userTypeSelector.setToolTipText("Selecciona tu usuario");
        userTypeSelector.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userTypeSelectorItemStateChanged(evt);
            }
        });
        jPanel1.add(userTypeSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 190, 30));

        lblError.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(204, 0, 51));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError.setText("Error: Llene todos los campos necesarios");
        jPanel1.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 430, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Repetir contraseña");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 190, -1));

        fieldRepeatPassword.setBackground(new java.awt.Color(255, 255, 255));
        fieldRepeatPassword.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldRepeatPassword.setForeground(new java.awt.Color(0, 0, 0));
        fieldRepeatPassword.setToolTipText("");
        jPanel1.add(fieldRepeatPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnThemeActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        readUsers();
        int user_type = userTypeSelector.getSelectedIndex() + 1;
        String name = fieldName.getText();
        String username = fieldUsername.getText();
        String password = new String(fieldPassword.getPassword());
        String repeatPassword = new String(fieldRepeatPassword.getPassword());
        boolean passwordMatch = password.equals(repeatPassword);
        String phone = fieldPhone.getText();
        String email = fieldEmail.getText();
        int idUser = users.size() + 1;
        int idSucursal;

        System.out.println("Password: " + password);
        System.out.println("Repeat Password: " + repeatPassword);

        Sucursal sucursal;
        if (passwordMatch) {
            switch (user_type){
                case 1: // Admin

                    if(name == null || username == null || password == null || phone == null || email == null){
                        lblError.setVisible(true);
                        return;
                    }
                    lblError.setVisible(false);
                    User admin = new User(idUser, name, username, phone, user_type, null, email, true, password);
                    registerUser(admin);
                    JOptionPane.showMessageDialog(null,"Administrador registrado con éxito");

                    break;
                case 2: // Usuario
                    idSucursal = sucursalSelector.getSelectedIndex();
                    sucursal = sucursales.get(idSucursal);
                    if(name == null || username == null || password == null || phone == null || email == null || sucursal == null){
                        lblError.setVisible(true);
                        return;
                    }
                    lblError.setVisible(false);
                    User user = new User(idUser, name, username, phone, user_type, sucursal.getIdSucursal(), email, true, password);
                    registerUser(user);
                    JOptionPane.showMessageDialog(null,"Usuario registrado con éxito");
                    break;

                case 3: // Vendedor
                    idSucursal = sucursalSelector.getSelectedIndex();
                    sucursal = sucursales.get(idSucursal);
                    if(name == null || username == null || password == null || phone == null || email == null || sucursal == null){
                        lblError.setVisible(true);
                        return;
                    }
                    lblError.setVisible(false);
                    User seller = new User(idUser, name, username, phone, user_type, sucursal.getIdSucursal(), email, true, password);
                    registerUser(seller);
                    JOptionPane.showMessageDialog(null,"Vendedor registrado con éxito");
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de usuario no válido: " + user_type); // No se deberia tener otro tipo de usuario
            }
        } else{
            lblError.setText("Error: Las contraseñas no coinciden");
            lblError.setVisible(true);
        }

        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        new ControlPanel(admin).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        readSucursales();
        readUsers();
        checkUserType();
    }//GEN-LAST:event_formWindowOpened

    private void checkUserType(){
        int indexSelected = userTypeSelector.getSelectedIndex();
        System.out.println("Tipo usuario: "+(indexSelected+1));
        if(indexSelected == 0){
            sucursalSelector.setEnabled(false);
        }else{
            sucursalSelector.setEnabled(true);
        }
    }
    
    private void userTypeSelectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userTypeSelectorItemStateChanged
        // TODO add your handling code here:
        checkUserType();
    }//GEN-LAST:event_userTypeSelectorItemStateChanged

    private void readSucursales(){
        sucursales.clear();
        sucursalSelector.removeAll();
        try {
            BufferedReader br = new BufferedReader( new FileReader(SUCURSAL_FILE));
            String lectura;
            String resultado = "";
            while((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();

            if(resultado.length() > 0) {
                java.lang.reflect.Type listType =
                        new TypeToken<ArrayList<Sucursal>>() {}.getType();

                sucursales = new Gson().fromJson(resultado, listType);
            }

            for(Sucursal sucursal : sucursales){
                if(sucursal.isStatus()){
                    sucursalSelector.addItem(sucursal.getNombre());
                }
                
            }
            sucursalSelector.updateUI();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void registerUser(User user){
        readUsers();
        try {
            users.add(user);
            String json = new Gson().toJson(users);
            FileWriter fw = new FileWriter(USER_FILE);
            fw.write(json);
            fw.close();
            readUsers();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void readUsers(){
        users.clear();
        try {
            BufferedReader br = new BufferedReader( new FileReader(USER_FILE));
            String lectura;
            String resultado = "";
            while((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();

            if(resultado.length() > 0) {
                java.lang.reflect.Type listType =
                        new TypeToken<ArrayList<User>>() {}.getType();

                users = new Gson().fromJson(resultado, listType);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(RegisterGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnTheme;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldName;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldPhone;
    private javax.swing.JPasswordField fieldRepeatPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblError;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JComboBox<String> sucursalSelector;
    private javax.swing.JComboBox<String> userTypeSelector;
    // End of variables declaration//GEN-END:variables
}
