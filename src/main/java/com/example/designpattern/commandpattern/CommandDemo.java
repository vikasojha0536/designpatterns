package com.example.designpattern.commandpattern;

public class CommandDemo {

    public static void main(String[] args) {

        Light light = new Light();
        Switch lightSwitch = new Switch();
        Command onCommand = new OnCommand(light);
        lightSwitch.storeAndExecute(onCommand);
    }
}
