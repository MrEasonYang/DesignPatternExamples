package com.designpattern.proxy;

/**
 * Created by Eason Yang on 12/28/2016.
 */
public class Proxy implements GiveGift {
    Pursuit boy;

    public Proxy(String girl) {
        this.boy = new Pursuit(girl);
    }

    @Override
    public void GiveChocolate() {
        this.boy.GiveChocolate();
    }

    @Override
    public void GiveDolls() {
        this.boy.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        this.boy.GiveFlowers();
    }
}
