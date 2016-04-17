package com.designpattern.realDecorator;

/**
 * Created by Eason Yang on 12/31/2016.
 */
public class TestDecorator {
    public static void main(String[] args) {
        Component component = new ConcreteDecorator2( new ConcreteDecorator1( new ConcreteComponent() ) );

        component.test();
    }
}
