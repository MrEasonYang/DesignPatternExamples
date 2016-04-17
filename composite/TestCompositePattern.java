package com.designpattern.composite;

/**
 * Created by Eason Yang on 12/17/2015.
 */
public class TestCompositePattern {
    public static void main(String[] args) {
        Shape firstTriangle = new Triangle();
        Shape secondTriangle = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(firstTriangle);
        drawing.add(secondTriangle);
        drawing.add(circle);

        drawing.draw("黑色");

        drawing.clear();

        drawing.add(firstTriangle);
        drawing.add(circle);
        drawing.draw("蓝色");
        drawing.clear();
    }
}
