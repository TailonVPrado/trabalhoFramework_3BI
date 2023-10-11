/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.factorymethod.hamburguerAngus;

import java.util.Map;

/**
 *
 * @author tailon.prado
 */
public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
