package com.dohyundev.behavioral.template_method;

class ConcreteClass1 extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("예시1 primitiveOperation1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("예시1 primitiveOperation2");
    }

    @Override
    protected void primitiveOperation3() {
        System.out.println("훅 메서드 override 안하면 그대로 실행");
    }
}
