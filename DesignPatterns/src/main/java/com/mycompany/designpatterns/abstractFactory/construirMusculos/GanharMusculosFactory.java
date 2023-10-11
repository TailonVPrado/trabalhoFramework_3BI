package com.mycompany.designpatterns.abstractFactory.construirMusculos;

import com.mycompany.designpatterns.abstractFactory.IGanharMusculo;
import com.mycompany.designpatterns.abstractFactory.IPerderPeso;
import com.mycompany.designpatterns.abstractFactory.WidgetFactory;
import com.mycompany.designpatterns.abstractFactory.perderPeso.Peso;

public class GanharMusculosFactory implements WidgetFactory {
    @Override
    public IGanharMusculo ganharMusculo() {
        return new Musculo();
    }

    @Override
    public IPerderPeso perderPeso() {
        return new Peso();
    }
}
