package com.designpattern.adaptor;

/**
 * Created by Eason Yang on 12/28/2015.
 */
public class Facility implements Extra {
    public void makeClean() {
        System.out.println("清理设备");
    }

    @Override
    public void takeCare() {
        System.out.println("清理设备");
    }
}
