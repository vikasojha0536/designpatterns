package com.example.designpattern.commandpattern;

/**
 * Concrete Command
 */
public class OnCommand implements Command {
    private Light light;
    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
