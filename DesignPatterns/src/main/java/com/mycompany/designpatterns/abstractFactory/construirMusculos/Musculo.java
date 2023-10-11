package com.mycompany.designpatterns.abstractFactory.construirMusculos;

import com.mycompany.designpatterns.abstractFactory.IGanharMusculo;

public class Musculo implements IGanharMusculo {
    @Override
    public void render() {
        System.out.println("Ganhando Musculos");
    }
}
