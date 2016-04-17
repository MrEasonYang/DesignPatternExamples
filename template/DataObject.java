package com.designpattern.template;

/**
 * Created by Eason Yang on 12/10/2015.
 */
public interface DataObject {
    public boolean connect();

    public boolean select();

    public boolean process();

    public boolean disconnect();

    default public void run() {
        if( this.connect() ) {
            if( this.select() ) {
                this.process();
            }
        }
        this.disconnect();
    }
}
