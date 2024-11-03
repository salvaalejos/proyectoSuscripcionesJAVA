package Models;

public class Payment {
    private int id_payment;
    private Subscription subscription;
    private Double amount;
    private String payment_date;
    private boolean isRecharged;
    private boolean isPaid;

    public Payment(int id_payment, Subscription subscription, Double amount, String payment_date, boolean isRecharged, boolean isPaid) {
        this.id_payment = id_payment;
        this.subscription = subscription;
        this.amount = amount;
        this.payment_date = payment_date;
        this.isRecharged = isRecharged;
        this.isPaid = isPaid;
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

    public boolean isIsRecharged() {
        return isRecharged;
    }

    public void setIsRecharged(boolean isRecharged) {
        this.isRecharged = isRecharged;
    }

    public boolean isIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }


}
