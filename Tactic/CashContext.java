package com.designpattern.Tactic;

/**
 * Created by Eason Yang on 12/21/2015.
 */
public class CashContext {
    CashSuper cashSuper = null;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                cashSuper = cashNormal;
                break;
            case "满300返100":
                CashReturn cashReturn = new CashReturn(300, 100);
                cashSuper = cashReturn;
                break;
            case "打8折":
                CashRebate cashRebate = new CashRebate(0.8);
                cashSuper = cashRebate;
                break;
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
