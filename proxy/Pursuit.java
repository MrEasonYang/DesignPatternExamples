package com.designpattern.proxy;

/**
 * Created by Eason Yang on 12/28/2016.
 */
public class Pursuit implements GiveGift {
    String girl;

    public Pursuit(String girl) {
        this.girl = girl;
    }

    @Override
    public void GiveChocolate() {
        System.out.println("送你巧克力");
    }

    @Override
    public void GiveFlowers() {
        System.out.println("送你花");
    }

    @Override
    public void GiveDolls() {
        System.out.println("送你娃娃");
    }
}
