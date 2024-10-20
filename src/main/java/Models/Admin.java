/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author hfyh
 */
public class Admin{
    private ArrayList<Sucursal> sucursales;
    private ArrayList<Client> clients;
    private ArrayList<Seller> sellers;
    private String name;
    private String username;
    private int id_admin;
    private String password;

    public Admin(ArrayList<Sucursal> sucursales, ArrayList<Client> clients, ArrayList<Seller> sellers, String name, int id_admin, String password, String username) {
        this.sucursales = sucursales;
        this.clients = clients;
        this.sellers = sellers;
        this.name = name;
        this.id_admin = id_admin;
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(ArrayList<Seller> sellers) {
        this.sellers = sellers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }
    
    
    
    
}
