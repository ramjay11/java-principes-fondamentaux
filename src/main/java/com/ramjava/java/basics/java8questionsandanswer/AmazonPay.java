package com.ramjava.java.basics.java8questionsandanswer;

public class AmazonPay implements UPIPayment{
    @Override
    public String doPayment(String source, String dest) {
        return null;
    }

    @Override
    public double getScratchCard() {
        return UPIPayment.super.getScratchCard();
    }
}
