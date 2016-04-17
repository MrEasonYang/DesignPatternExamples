package com.designpattern.adaptor;

/**
 * Created by Eason Yang on 12/28/2015.
 */
public class Workshop implements Clean {
    @Override
    public void makeClean() {
        System.out.println("清理工作车间");
    }
}
