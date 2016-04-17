package com.designpattern.carState;

/**
 * Created by Eason Yang on 12/21/2015.
 */
public abstract class State {
    public void pull( Car wrapper ) {
        wrapper.setState( new Off() );
        System.out.println( " turning off" );
    }
}

