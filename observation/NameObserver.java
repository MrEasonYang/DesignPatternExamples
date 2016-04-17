package com.designpattern.observation;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Eason Yang on 12/7/2015.
 */
public class NameObserver implements Observer {
    private DirectTriangleObservable triangle;

    public NameObserver(DirectTriangleObservable triangle) {
        this.triangle = triangle;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o == this.triangle) {
            System.out.println("名称为：" + this.triangle.getName() );
        }
    }
}
