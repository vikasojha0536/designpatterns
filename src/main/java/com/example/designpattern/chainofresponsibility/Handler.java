package com.example.designpattern.chainofresponsibility;

public interface Handler {

    void setSuccessor(Handler successor);

    void handleRequest(Request request);
}
