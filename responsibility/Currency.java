package com.designpattern.responsibility;

/**
 * Created by Eason Yang on 12/31/2015.
 */
public class Currency {
    private int amount;

    public Currency(int amt){
        this.amount=amt;
    }

    public int getAmount(){
        return this.amount;
    }
}
