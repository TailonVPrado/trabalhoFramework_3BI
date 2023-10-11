package com.mycompany.designpatterns.abstractFactory.perderPeso;

import com.mycompany.designpatterns.abstractFactory.IGanharMusculo;
import com.mycompany.designpatterns.abstractFactory.IPerderPeso;
import com.mycompany.designpatterns.abstractFactory.WidgetFactory;
import com.mycompany.designpatterns.abstractFactory.construirMusculos.Musculo;

public class PerderPesoFactory implements WidgetFactory {
    @Override
    public IGanharMusculo ganharMusculo() {
        return new Musculo();
    }

    @Override
    public IPerderPeso perderPeso() {
        return new Peso();
    }
}
