package com.example.oop.ModelClasses;

import java.time.LocalDateTime;

public class payment {
    private String paymentid;
    private int amount;
    private int cardnumber;
    private LocalDateTime date;

    public payment(String paymentid, int amount, int cardnumber, LocalDateTime date) {
        this.paymentid = paymentid;
        this.amount = amount;
        this.cardnumber = cardnumber;
        this.date = date;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "payment{" +
                "paymentid='" + paymentid + '\'' +
                ", amount=" + amount +
                ", cardnumber=" + cardnumber +
                ", date=" + date +
                '}';
    }
}
