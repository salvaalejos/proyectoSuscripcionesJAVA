/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import Models.Subscription;
import Models.Sucursal;
import Models.User;
import Utilities.Paths;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
public class ClientControlPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClientControlPanel
     */
    
    private ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
    private ArrayList<User> clients = new ArrayList<User>();
    private ArrayList<Subscription> subscriptions = new ArrayList<Subscription>();

    private User admin;
    
    public ClientControlPanel() {
        initComponents();
        
        
    }
    
    public ClientControlPanel(User admin) {
        this.admin = admin;
        initComponents();
        readSubscriptions();
        readSucursales();
        readClients();
        


    }

    private void readClients(){
        clients.clear();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(USER_FILE)
            );
            String lectura;
            String resultado = "";
            while((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();

            if(resultado.length() > 0) {
                java.lang.reflect.Type listType =
                        new TypeToken<ArrayList<User>>() {}.getType();

                clients = new Gson().fromJson(resultado, listType);
            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            for(User client : clients){
                if(client.getUser_type() != 2){
                    continue;
                }

                String estado = "";
                if(client.isStatus()){
                    estado = "Activa";
                } else{
                    estado = "Inactiva";
                }

                String sucursal = "";
                for(Sucursal s : sucursales){
                    if(s.getIdSucursal() == client.getSucursal()){
                        sucursal = s.getNombre();
                    }
                }

                String Subscription = "";
                for(Subscription s : subscriptions){
                    if(s.getUser().getId_user() == client.getId_user()){
                        Subscription = s.getPlan().getTitle();
                    }
                }
                if(Subscription.equals("")){
                    Subscription = "No tiene suscripcion aún";
                    estado = "Inactiva";
                }

                model.addRow(new Object[]{client.getId_user(), client.getUsername(), client.getPhone(), client.getEmail(), sucursal, Subscription, estado});
                jTable1.setModel(model);
                jTable1.updateUI();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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

    private void readSubscriptions(){
        subscriptions.clear();
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(Paths.SUBSCRIPTION_FILE)
            );
            String lectura;
            String resultado = "";
            while((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();

            if(resultado.length() > 0) {
                java.lang.reflect.Type listType =
                        new TypeToken<ArrayList<Subscription>>() {}.getType();

                subscriptions = new Gson().fromJson(resultado, listType);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDeleteClient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnChangeSucursal = new javax.swing.JButton();
        btnChangeStatus = new javax.swing.JButton();
        sucursalSelector = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(245, 245, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_User", "Usuario", "Telefono", "Email", "Sucursal", "Suscripcion", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 740, 530));

        btnDeleteClient.setBackground(new java.awt.Color(255, 51, 0));
        btnDeleteClient.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnDeleteClient.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteClient.setText("Eliminar");
        btnDeleteClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteClientActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 180, 20));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escoge sucursal");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 180, -1));

        btnChangeSucursal.setBackground(new java.awt.Color(105, 108, 255));
        btnChangeSucursal.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnChangeSucursal.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeSucursal.setText("Cambiar sucursal");
        btnChangeSucursal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnChangeSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(btnChangeSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 180, 40));

        btnChangeStatus.setBackground(new java.awt.Color(0, 255, 51));
        btnChangeStatus.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnChangeStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeStatus.setText("Cambiar estado");
        btnChangeStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeStatusActionPerformed(evt);
            }
        });
        jPanel1.add(btnChangeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 180, 20));

        jPanel1.add(sucursalSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents



    private void btnDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteClientActionPerformed
        // TODO add your handling code here:
        User client = selectedClient();
        JOptionPane.showMessageDialog(null, "Eliminacion del usuario "+client.getUsername());

        clients.remove(clients.indexOf(selectedClient()));
        String json = new Gson().toJson(clients);
        try {
            FileWriter fw = new FileWriter(USER_FILE);
            fw.write(json);
            fw.close();
            readClients();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteClientActionPerformed

    private void btnChangeSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeSucursalActionPerformed
        // TODO add your handling code here:
        Integer idUser = jTable1.getSelectedRow();
        Integer idSucursal = sucursalSelector.getSelectedIndex();
        Sucursal sucursal = sucursales.get(idSucursal);
        idSucursal = sucursal.getIdSucursal();

        if(idSucursal == null){
            return;
        }

        User client = selectedClient();
        
        
        JOptionPane.showMessageDialog(null, "Cambio de sucursal del usuario "+client.getUsername());
        client.setSucursal(idSucursal);
        clients.set(clients.indexOf(selectedClient()), client);
        String json = new Gson().toJson(clients);
        try {
            FileWriter fw = new FileWriter(USER_FILE);
            fw.write(json);
            fw.close();
            readClients();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnChangeSucursalActionPerformed

    private void btnChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeStatusActionPerformed
        // TODO add your handling code here:
        User client = selectedClient();
        
        
        String Subscription = "";
        for(Subscription s : subscriptions){
            if(s.getUser().getId_user() == client.getId_user()){
                Subscription = s.getPlan().getTitle();
            }
        }
        if(Subscription.equals("")){
            JOptionPane.showMessageDialog(null, "No tiene suscripción aún, por lo que no sigue INACTIVO");
            return;
        }
        client.setStatus(!client.isStatus());
        clients.set(clients.indexOf(selectedClient()), client);
        System.out.println("Cliente: "+client.getId_user()+".- "+client.getName()+"\nUser: "+client.getUsername());
        JOptionPane.showMessageDialog(null, "Estado cambiado de la suscripción de: "+client.getUsername());
        save();
        
    }//GEN-LAST:event_btnChangeStatusActionPerformed
    
    private User selectedClient(){
        User client = null;
        int indice = jTable1.getSelectedRow();
        if(indice<0){
            return null;
        }
        int idUser =  (int)jTable1.getValueAt(indice, 0);
        for(User c : clients){
            if(c.getId_user() == idUser){
                client = c;
            }
        }
        
        return client;
    }
    
    private void save(){
        String json = new Gson().toJson(clients);
        try {
            FileWriter fw = new FileWriter(USER_FILE);
            fw.write(json);
            fw.close();
            readSucursales();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        readClients();
        readSubscriptions();
        readSucursales();
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeStatus;
    private javax.swing.JButton btnChangeSucursal;
    private javax.swing.JButton btnDeleteClient;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> sucursalSelector;
    // End of variables declaration//GEN-END:variables
}
