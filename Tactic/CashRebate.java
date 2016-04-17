package com.designpattern.Tactic;

/**
 * Created by Eason Yang on 12/21/2015.
 */
public class CashRebate implements CashSuper {
    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * this.moneyRebate;
    }
}
