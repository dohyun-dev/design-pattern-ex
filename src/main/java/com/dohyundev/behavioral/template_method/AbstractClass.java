package com.dohyundev.behavioral.template_method;

abstract class AbstractClass {
    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        if (isExecuteOperation3()) {
            primitiveOperation3();
        }
    }

    protected abstract void primitiveOperation1();
    protected abstract void primitiveOperation2();
    protected abstract void primitiveOperation3();

    // Hook method
    boolean isExecuteOperation3() {
        return true;
    }
}
