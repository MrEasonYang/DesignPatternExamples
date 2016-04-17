package com.designpattern.Tactic;

/**
 * Created by Eason Yang on 12/21/2015.
 */
public class Main {
    public static void main(String[] args) {
        CashContext cashContextNormal = new CashContext("正常收费");
        System.out.println( cashContextNormal.getResult(500) );
        CashContext cashContextReturn = new CashContext("满300返100");
        System.out.println( cashContextReturn.getResult(500) );
        CashContext cashContextRebate = new CashContext("打8折");
        System.out.println( cashContextRebate.getResult(500) );
    }
}
