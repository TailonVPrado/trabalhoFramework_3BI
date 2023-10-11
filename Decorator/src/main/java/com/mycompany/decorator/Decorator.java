/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorator;

/**
 *
 * @author tailon.prado
 */
public class Decorator {

    public static void main(String[] args) {
        EnviandoMessage(new SendSms(new Notificacao()));
        EnviandoMessage(new SendWhatsApp(new Notificacao()));
        EnviandoMessage(new SendWhatsApp(new SendSms(new Notificacao())));
    }

    public static void EnviandoMessage(Notifier notifier){
        notifier.write("Pedido enviado = ");
    }
}
