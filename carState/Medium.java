package com.designpattern.carState;

/**
 * Created by Eason Yang on 12/21/2015.
 */
class Medium extends State{
  public void pull( Car wrapper ) {
    wrapper.setState( new High() );
    System.out.println( "挂高速" );
  }
}
