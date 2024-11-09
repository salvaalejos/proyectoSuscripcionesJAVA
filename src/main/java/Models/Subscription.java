/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author hfyh
 */
public class Subscription {
    private int id_subscription;
    private User user;
    private String start_date;
    private String end_date;
    private boolean status;
    private SubscriptionPlan plan;

    public Subscription(int id_subscription, User user, String start_date, String end_date, boolean status, SubscriptionPlan plan) {
        this.id_subscription = id_subscription;
        this.user = user;
        this.start_date = start_date;
        this.end_date = end_date;
        this.status = status;
        this.plan = plan;
    }

    public int getId_subscription() {
        return id_subscription;
    }

    public void setId_subscription(int id_subscription) {
        this.id_subscription = id_subscription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public SubscriptionPlan getPlan() {
        return plan;
    }

    public void setPlan(SubscriptionPlan plan) {
        this.plan = plan;
    }
    
    


}
