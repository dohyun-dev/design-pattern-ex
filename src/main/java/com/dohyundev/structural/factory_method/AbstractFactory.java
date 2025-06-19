package com.dohyundev.structural.factory_method;

public abstract class AbstractFactory {
    public final Product create() {
        Product product = createProduct();
        product.setting();
        return product;
    }

    protected abstract Product createProduct();
}
