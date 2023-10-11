package com.mycompany.paymentpattern;

public class PayPalPaymentForm implements PaymentForm{
    @Override
    public void pay(String paymentForm) {
        System.out.println("Payment made in PayPal");
    }
}
