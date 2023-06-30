package com.example.designpattern.chainofresponsibility.everydayexample;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {

    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINER);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINER);
        logger.addHandler(consoleHandler);
        logger.finest("finest");
        logger.finer("finer");
        logger.fine("fine");

    }
}
