package com.designpattern.Singleton;

/**
 * Created by Eason Yang on 12/14/2015.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.instance();
        singleton.setData(22);
        System.out.println("第一个引用: " + singleton);
        System.out.println("值为: " + singleton.getData());
        singleton = null;
        singleton = Singleton.instance();
        System.out.println("\n第二个引用: " + singleton);
        System.out.println("值为: " + singleton.getData());
    }
}
