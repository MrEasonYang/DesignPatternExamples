package com.designpattern.observation;

import com.designpattern.observation.BottomObserver;
import com.designpattern.observation.DirectTriangleObservable;
import com.designpattern.observation.HeightObserver;
import com.designpattern.observation.NameObserver;

public class Main {

    public static void main(String[] args) {
        System.out.println("程序开始");
        DirectTriangleObservable triangle = new DirectTriangleObservable("John", 4, 3);
        NameObserver nameObserver = new NameObserver(triangle);
        BottomObserver bottomObserver = new BottomObserver(triangle);
        HeightObserver heightObserver = new HeightObserver(triangle);
        triangle.addObserver(bottomObserver);
        triangle.addObserver(nameObserver);
        triangle.addObserver(heightObserver);
        System.out.println("Do some change");
        triangle.setName("Tom");
        System.out.println("\n");
        triangle.setHeight(40);
        System.out.println("\n");
        triangle.setBottom(30);
    }
}
