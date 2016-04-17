package com.designpattern.Tactic;

/**
 * Created by Eason Yang on 12/21/2015.
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
