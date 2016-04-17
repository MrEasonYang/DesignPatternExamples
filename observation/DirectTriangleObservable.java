package com.designpattern.observation;

import java.util.Observable;

/**
 * Created by Eason Yang on 12/7/2015.
 */
public class DirectTriangleObservable extends Observable {
    private String name;

    private float height;

    private float bottom;

    public DirectTriangleObservable(String name, float height, float bottom) {
        this.name = name;
        this.height = height;
        this.bottom = bottom;
        System.out.println("三角形" + this.name +"已创建：底为" + this.bottom + "，高为：" + this.height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
        setChanged();
        notifyObservers();
    }

    public float getBottom() {
        return bottom;
    }

    public void setBottom(float bottom) {
        this.bottom = bottom;
        setChanged();
        notifyObservers();
    }
}
