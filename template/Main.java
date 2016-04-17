package com.designpattern.template;

/**
 * Created by Eason Yang on 12/10/2015.
 */
public class Main {
    public static void main(String[] args) {
        DataObject dataObject = new CustomerDataObject();
        System.out.println("程序开始");
        dataObject.run();
        System.out.println("程序结束");
    }
}
