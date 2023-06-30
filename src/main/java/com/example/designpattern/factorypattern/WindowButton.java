package com.example.designpattern.factorypattern;

public class WindowButton implements Button{

    @Override
    public void render() {
        System.out.println("Window button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Window button clicked");
    }
}
