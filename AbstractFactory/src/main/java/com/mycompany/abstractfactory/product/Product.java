package com.mycompany.abstractfactory.product;

import com.mycompany.abstractfactory.Box;
import lombok.Data;

@Data
public abstract class Product implements Box {

    protected final String title;
    protected final double price;

}
