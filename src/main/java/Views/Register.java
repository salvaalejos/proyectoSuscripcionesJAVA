/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.SwingUtilities;

/**
 *
 * @author hfyh
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    private int actualTheme;
    
    public Register() {
        initComponents();
    }
    
    public Register(int actualTheme) {
        this.actualTheme = actualTheme;
        if(actualTheme == 1){
            FlatLightLaf.setup();
        } else if(actualTheme == 0){
            FlatDarkLaf.setup();
        }
        initComponents();
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
        fieldUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fieldPassword = new javax.swing.JPasswordField();
        btnTheme = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fieldUsername1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldUsername2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldUsername3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hfyh\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoSuscripciones\\src\\main\\java\\Images\\PonyFood.png")); // NOI18N

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
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 180, -1));

        fieldUsername.setBackground(new java.awt.Color(255, 255, 255));
        fieldUsername.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldUsername.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 170, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 120, 40));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancelar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 120, 40));

        fieldPassword.setBackground(new java.awt.Color(255, 255, 255));
        fieldPassword.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldPassword.setForeground(new java.awt.Color(0, 0, 0));
        fieldPassword.setToolTipText("");
        jPanel1.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 190, 30));

        btnTheme.setBackground(new java.awt.Color(204, 204, 204));
        btnTheme.setIcon(new javax.swing.ImageIcon("C:\\Users\\hfyh\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoSuscripciones\\src\\main\\java\\Images\\dark-mode-black.png")); // NOI18N
        btnTheme.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemeActionPerformed(evt);
            }
        });
        jPanel1.add(btnTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 40, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre de usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 180, -1));

        fieldUsername1.setBackground(new java.awt.Color(255, 255, 255));
        fieldUsername1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldUsername1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(fieldUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 180, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sucursal");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 190, -1));

        fieldUsername2.setBackground(new java.awt.Color(255, 255, 255));
        fieldUsername2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldUsername2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(fieldUsername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 180, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 190, -1));

        fieldUsername3.setBackground(new java.awt.Color(255, 255, 255));
        fieldUsername3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldUsername3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(fieldUsername3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 190, 30));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 432, 190, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemeActionPerformed
        // TODO add your handling code here:
        if( actualTheme == 1){
            actualTheme = 0;
            FlatDarkLaf.setup();
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
        } else if (actualTheme == 0){
            actualTheme = 1;
            FlatLightLaf.setup();
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
        }
    }//GEN-LAST:event_btnThemeActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTheme;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JTextField fieldUsername1;
    private javax.swing.JTextField fieldUsername2;
    private javax.swing.JTextField fieldUsername3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
