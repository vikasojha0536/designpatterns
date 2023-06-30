package com.example.designpattern.prototypepattern.everydayexample;

public class Records implements Cloneable{

    public Records clone() {
        try {
            return (Records) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
