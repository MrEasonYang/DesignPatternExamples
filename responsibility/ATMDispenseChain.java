package com.designpattern.responsibility;

import java.util.Scanner;

/**
 * Created by Eason Yang on 12/31/2015.
 */
public class ATMDispenseChain {

    private DispenseChain chain;

    public ATMDispenseChain() {
        this.chain = new Yuan50Dispenser();
        DispenseChain chain2 = new Yuan20Dispenser();
        DispenseChain chain3 = new Yuan10Dispenser();

        chain.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Error");
                return;
            }
            atmDispenser.chain.dispense(new Currency(amount));
        }

    }

}
