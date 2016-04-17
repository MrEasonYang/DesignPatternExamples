package com.designpattern.composite;

/**
 * Created by Eason Yang on 12/17/2015.
 */
public class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("当前圆的颜色为： "+fillColor);
    }
}
