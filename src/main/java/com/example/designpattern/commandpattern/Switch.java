package com.example.designpattern.commandpattern;

/**
 * Invoker
 */
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();

    }

}
