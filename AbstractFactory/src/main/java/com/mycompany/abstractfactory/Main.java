/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractfactory;

import com.mycompany.abstractfactory.product.Juice;
import com.mycompany.abstractfactory.product.Toxies;

/**
 *
 * @author tailon.prado
 */
public class Main {

    public static void main(String[] args) {
        
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(new CompositeBox(new Juice("SUCO", 399.00)),
                new CompositeBox(new Toxies("TOXICO 1", 25.55), new Toxies("TOXICO 2", 25.00)),
                new Juice("TREMBOLONA", 148.00)
        );
        System.out.println(deliveryService.calculateOrderPrice());
    }
}
