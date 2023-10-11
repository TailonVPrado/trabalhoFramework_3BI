package com.mycompany.designpatterns.abstractFactory.perderPeso;

import com.mycompany.designpatterns.abstractFactory.IPerderPeso;

public class Peso implements IPerderPeso {
    @Override
    public void render() {
        System.out.println("Perdendo o peso");
    }
}
