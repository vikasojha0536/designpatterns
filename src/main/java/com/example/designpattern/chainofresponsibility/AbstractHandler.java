package com.example.designpattern.chainofresponsibility;

public abstract class AbstractHandler implements Handler {

    protected Handler successor;

    @Override
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
