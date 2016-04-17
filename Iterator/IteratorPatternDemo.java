package com.designpattern.Iterator;

/**
 * Created by Eason Yang on 12/17/2015.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for( Iterator item = namesRepository.getIterator(); item.hasNext(); ){
            String name = (String)item.next();
            System.out.println("Name : " + name);
        }
    }
}
