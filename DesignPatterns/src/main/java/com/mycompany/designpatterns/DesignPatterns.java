/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.designpatterns;

import com.mycompany.designpatterns.abstractFactory.app.ContactForm;
import com.mycompany.designpatterns.abstractFactory.construirMusculos.GanharMusculosFactory;

/**
 *
 * @author tailon.prado
 */
public class DesignPatterns {
    public static void main(String[] args) {
       new ContactForm().render(new GanharMusculosFactory());
    }
}
