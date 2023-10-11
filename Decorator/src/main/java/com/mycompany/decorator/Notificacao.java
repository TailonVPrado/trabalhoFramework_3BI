package com.mycompany.decorator;

public class Notificacao implements Notifier {
    @Override
    public void write(String message){
        System.out.println("Enviando... "+ message);
    }
}

