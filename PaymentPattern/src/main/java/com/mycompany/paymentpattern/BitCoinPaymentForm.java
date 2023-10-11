package com.mycompany.paymentpattern;

public class BitCoinPaymentForm implements PaymentForm{
    @Override
    public void pay(String paymentForm) {
        System.out.println("Payment made in Bitcoin");
    }
}
