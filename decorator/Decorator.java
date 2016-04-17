package com.designpattern.realDecorator;

/**
 * Created by Eason Yang on 12/31/2016.
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void test() {
        component.test();
    }
}
