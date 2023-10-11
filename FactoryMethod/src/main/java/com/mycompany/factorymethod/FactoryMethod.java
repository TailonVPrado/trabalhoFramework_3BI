/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorymethod;

import java.util.Calendar;

/**
 *
 * @author tailon.prado
 */
public class FactoryMethod {

    public static void main(String[] args) {
        Calendar.getInstance();

        new ProdutoController().listProduct();
        
    }
}
