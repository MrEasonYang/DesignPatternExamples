package com.designpattern.factory;

/**
 * Created by Eason Yang on 12/14/2015.
 */
public class MotorolaFactory implements MobileFactory {
    public Mobile produceMobile() {
        System.out.print("摩托罗拉工厂制造了");
        return new Motorola();
    }
}
