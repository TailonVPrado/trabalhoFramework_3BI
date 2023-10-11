/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paymentpattern;

/**
 *
 * @author tailon.prado
 */
public class PaymentPattern {

    public static void main(String[] args) {
        
        Payment payment = new Payment();
        payment.payForm("Cartao de crédito", new CreditCardPaymentForm());
        payment.payForm("Bitcoin", new BitCoinPaymentForm());
        payment.payForm("Paypal", new PayPalPaymentForm());
        payment.payForm("Money", new MoneyPaymentForm());
    }
}
