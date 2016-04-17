package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eason Yang on 12/17/2015.
 */
public class Drawing implements Shape {
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw(String fillColor) {
        for(Shape sh : shapes)
        {
            sh.draw(fillColor);
        }
    }

    public void add(Shape s){
        this.shapes.add(s);
    }

    public void remove(Shape s){
        shapes.remove(s);
    }

    public void clear(){
        System.out.println("删除所有图形");
        this.shapes.clear();
    }
}
