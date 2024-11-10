package Models;

public class Payment {
    private int id_payment;
    private Subscription subscription;
    private Double amount;
    private String payment_date;

    public Payment(int id_payment, Subscription subscription, Double amount, String payment_date) {
        this.id_payment = id_payment;
        this.subscription = subscription;
        this.amount = amount;
        this.payment_date = payment_date;
    }

    public int getId_payment() {
        return id_payment;
    }

    public void setId_payment(int id_payment) {
        this.id_payment = id_payment;
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

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }



}
