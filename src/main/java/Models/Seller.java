/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author hfyh
 */
public class Seller extends User{
    private double comission;
    private double gains;

    public Seller(double comission, double gains, int id_user, String name, String username, String phone, int user_type, Sucursal sucursal, String email) {
        super(id_user, name, username, phone, user_type, sucursal, email);
        this.comission = comission;
        this.gains = gains;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    public double getGains() {
        return gains;
    }

    public void setGains(double gains) {
        this.gains = gains;
    }
    
    
    
}
