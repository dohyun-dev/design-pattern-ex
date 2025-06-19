package com.dohyundev.creational.factory_method;

public abstract class ProductFactory {
    public final Product create() {
        Product product = createProduct();
        product.setting();
        return product;
    }

    protected abstract Product createProduct();
}
