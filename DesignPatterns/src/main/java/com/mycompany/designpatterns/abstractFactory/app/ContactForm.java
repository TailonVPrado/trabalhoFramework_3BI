package com.mycompany.designpatterns.abstractFactory.app;

import com.mycompany.designpatterns.abstractFactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.ganharMusculo().render();
        factory.perderPeso().render();
    }
}
