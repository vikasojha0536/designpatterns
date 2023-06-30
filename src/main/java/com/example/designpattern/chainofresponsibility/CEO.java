package com.example.designpattern.chainofresponsibility;

public class CEO extends AbstractHandler{

    @Override
    public void handleRequest(Request request) {
                System.out.println("CEO can approve anything");
    }
}
