package com.designpattern.Singleton;

/**
 * Created by Eason Yang on 12/14/2015.
 */
public class Singleton {
    private static Singleton uniqueInstance = null;

    private int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public static Singleton instance() {
        if(uniqueInstance == null) uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    private Singleton() {}
}
