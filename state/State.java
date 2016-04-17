package com.designpattern.state;

import java.awt.*;

/**
 * Created by Eason Yang on 1/5/2016.
 */
public abstract class State {
	public abstract void handlePush(Context c);
	public abstract void handlePull(Context c);
	public abstract Color getColor();
}
