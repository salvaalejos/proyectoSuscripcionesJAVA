package Models;

public class Comition {
    private int id_comition;
    private User seller;
    private Subscription subscription;
    private Double amount;
    private String comition_date;

    public Comition(int id_comition, User seller, Subscription subscription, Double amount, String comition_date) {
        this.id_comition = id_comition;
        this.seller = seller;
        this.subscription = subscription;
        this.amount = amount;
        this.comition_date = comition_date;
    }

    public int getId_comition() {
        return id_comition;
    }

    public void setId_comition(int id_comition) {
        this.id_comition = id_comition;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getComition_date() {
        return comition_date;
    }

    public void setComition_date(String comition_date) {
        this.comition_date = comition_date;
    }



}
