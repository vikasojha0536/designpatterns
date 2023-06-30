package com.example.designpattern.chainofresponsibility;

public class Director extends AbstractHandler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors approves conferences");
        }
        else {
            successor.handleRequest(request);
        }
    }
}
