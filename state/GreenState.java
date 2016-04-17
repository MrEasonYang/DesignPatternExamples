package com.designpattern.state;

import java.awt.*;

/**
 * Created by Eason Yang on 1/5/2016.
 */
public class GreenState extends State {
    // Next state for the Black state:
// On a push(), go to "red"
// On a pull(), go to "green"
    public void handlePush(Context c) {
        c.setState( new RedState() );
    }
    public void handlePull(Context c) {
        c.setState( new BlueState() );
    }
    public Color getColor() {return (Color.green);}
}

