package com.designpattern.carState;

/**
 * Created by Eason Yang on 12/21/2015.
 */
class Off extends State {
  public void pull( Car wrapper ) {
  wrapper.setState( new Low() );
  System.out.println( "挂低速" );
  }
}
