package com.designpattern.proxy;

/**
 * Created by Eason Yang on 12/28/2016.
 */
public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy("韩晓梅");
        proxy.GiveChocolate();
        proxy.GiveDolls();
        proxy.GiveFlowers();
    }
}
