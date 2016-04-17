package com.designpattern.factory;

/**
 * Created by Eason Yang on 12/14/2015.
 */
public class Client {
    public static void main(String[] args) {
        MobileFactory mobileFactory;
        Mobile mobile;
        mobileFactory = new MotorolaFactory();
        mobile = mobileFactory.produceMobile();
        mobile.call();
        mobileFactory = new NokiaFactory();
        mobile = mobileFactory.produceMobile();
        mobile.call();
    }
}
