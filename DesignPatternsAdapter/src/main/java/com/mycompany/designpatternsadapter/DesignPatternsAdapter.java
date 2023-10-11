/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.designpatternsadapter;
import com.mycompany.designpatternsadapter.email.Gmail;
import com.mycompany.designpatternsadapter.email.Yahoo;

/**
 *
 * @author tailon.prado
 */
public class DesignPatternsAdapter {

    public static void main(String[] args) {
        EmailView emailView = new EmailView(new Email());
        //emailView.apply(new GmailSend(new Gmail()));
        emailView.apply(new YohooSend(new Yahoo()));
    }
}
