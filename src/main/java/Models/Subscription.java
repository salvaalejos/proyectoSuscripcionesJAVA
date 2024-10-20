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
public class Subscription {
    private int id_subscription;
    private double price;
    private String name;
    private String description;
    private ArrayList<String> advantages;
    private int daysToExpire;

    public Subscription(int id_subscription, double price, String name, String description, ArrayList<String> advantages, int daysToExpire) {
        this.id_subscription = id_subscription;
        this.price = price;
        this.name = name;
        this.description = description;
        this.advantages = advantages;
        this.daysToExpire = daysToExpire;
    }

    public int getId_subscription() {
        return id_subscription;
    }

    public void setId_subscription(int id_subscription) {
        this.id_subscription = id_subscription;
    }
    public int getDaysToExpire() {
        return daysToExpire;
    }

    public void setDaysToExpire(int daysToExpire) {
        this.daysToExpire = daysToExpire;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getAdvantages() {
        return advantages;
    }

    public void setAdvantages(ArrayList<String> advantages) {
        this.advantages = advantages;
    }
    
    
    
}
