package com.designpattern.adaptor;

/**
 * Created by Eason Yang on 12/28/2015.
 */
public class Client {
    static void Jobs(Clean currentJob) {
        if(currentJob instanceof Clean) {
            Clean cleaner = (Clean)currentJob;
            cleaner.makeClean();
        }
        if(currentJob instanceof Extra) {
            Extra extra = (Extra)currentJob;
            extra.takeCare();
        }
    }

    public static void main(String[] args) {
        Extra extra = new Facility();
        Jobs(extra);
        Clean office = new Office();
        Clean workshop = new Workshop();
        Jobs(office);
        Jobs(workshop);
    }
}
