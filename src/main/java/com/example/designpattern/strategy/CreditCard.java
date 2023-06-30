package com.example.designpattern.strategy;

public class CreditCard {

    private String number;
    private String date;
    private String cvv;
    private ValidationStrategy strategy;

    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public String getNumber() {
        return number;
    }

    public boolean isValid() {
        return strategy.isValid(this);
    }

    public CreditCard setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getDate() {
        return date;
    }

    public CreditCard setDate(String date) {
        this.date = date;
        return this;
    }

    public String getCvv() {
        return cvv;
    }

    public CreditCard setCvv(String cvv) {
        this.cvv = cvv;
        return this;
    }

    public ValidationStrategy getStrategy() {
        return strategy;
    }

    public CreditCard setStrategy(ValidationStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
}
