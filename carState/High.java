package com.designpattern.carState;

/**
 * Created by Eason Yang on 12/21/2015.
 */
class High extends State {
  public void pull (Car wrapper) {
    wrapper.setState (new Off ());
    System.out.println ( "挂空档" );
  }
}

