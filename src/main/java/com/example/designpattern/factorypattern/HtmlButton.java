package com.example.designpattern.factorypattern;

public class HtmlButton implements Button{

    @Override
    public void render() {
        System.out.println("Html button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Html button clicked");
    }
}
