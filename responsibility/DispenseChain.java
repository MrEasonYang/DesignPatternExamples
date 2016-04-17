package com.designpattern.responsibility;

/**
 * Created by Eason Yang on 12/31/2015.
 */
public interface DispenseChain {
    public void setNextChain(DispenseChain nextChain);

    public void dispense(Currency cur);
}
