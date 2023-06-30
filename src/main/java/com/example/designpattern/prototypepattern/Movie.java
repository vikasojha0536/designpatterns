package com.example.designpattern.prototypepattern;

public class Movie extends Item {

    private String runtime;

    public String getRuntime() {
        return runtime;
    }

    public Movie setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
}
