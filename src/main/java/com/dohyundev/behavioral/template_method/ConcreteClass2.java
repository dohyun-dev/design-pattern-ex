package com.dohyundev.behavioral.template_method;

import java.util.Scanner;

class ConcreteClass2 extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("예시2 primitiveOperation1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("예시2 primitiveOperation2");
    }

    @Override
    protected void primitiveOperation3() {
        System.out.println("primitiveOperation3 실행됨");
    }

    @Override
    boolean isExecuteOperation3() {
        System.out.println("primitiveOperation3를 실행하시겠습니까?\n 실행하려면 : 'Y'");
        String input = new Scanner(System.in).next();
        return input.trim().equals("Y");
    }
}
