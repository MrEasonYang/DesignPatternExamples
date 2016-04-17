package com.designpattern.observation;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Eason Yang on 12/7/2015.
 */
public class BottomObserver implements Observer {
    private DirectTriangleObservable triangle;

    public BottomObserver(DirectTriangleObservable triangle) {
        this.triangle = triangle;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o == this.triangle) {
            System.out.println( "底为：" + this.triangle.getBottom() );
        }
    }
}
