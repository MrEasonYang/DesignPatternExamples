package com.designpattern.factory;

/**
 * Created by Eason Yang on 12/14/2015.
 */
public class NokiaFactory implements MobileFactory {
    public Mobile produceMobile(){
        System.out.print("诺基亚工厂制造了");
        return new Nokia();
    }
}
