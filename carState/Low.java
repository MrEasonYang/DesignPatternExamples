package com.designpattern.carState;

/**
 * Created by Eason Yang on 12/21/2015.
 */
class Low extends State {
    public void pull( Car wrapper ) {
        wrapper.setState( new Medium() );
        System.out.println( "挂中速" );
    }
}

