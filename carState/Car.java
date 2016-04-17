package com.designpattern.carState;

/**
 * Created by Eason Yang on 12/21/2015.
 */
public class Car {
    private State current;

    public Car() {
        current = new Off();
        System.out.println("汽车初始化为空挡");
    }
    public void setState( State s ) { current = s; }
    public void pull() { current.pull( this ); }
}

