package com.mycompany.factorymethod.hamburguerVegano;

import com.mycompany.factorymethod.hamburguerAngus.Controller;
import com.mycompany.factorymethod.hamburguerAngus.ViewEngine;

public class VeganController extends Controller {
    @Override
    protected ViewEngine createViewEngine(){
        return new VeganViewEngine();
    }
}
