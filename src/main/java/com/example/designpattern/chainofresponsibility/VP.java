package com.example.designpattern.chainofresponsibility;

public class VP extends AbstractHandler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE) {
            if(request.getAmount() < 1500) {

                System.out.println("VPs can approve purchases below 1500");
            }
            else {
                successor.handleRequest(request);
            }
        }

    }
}
