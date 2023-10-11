package com.mycompany.designpatterns.abstractFactory.perderPeso;

import com.mycompany.designpatterns.abstractFactory.IPerderPeso;

public class PerderPeso implements IPerderPeso {
    @Override
    public void render() {
        System.out.println("Perdendo peso");
    }
}
