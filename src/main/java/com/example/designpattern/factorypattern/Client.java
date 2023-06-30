package com.example.designpattern.factorypattern;

public class Client {

    public static void main(String[] args) {
        AbstractDialog dialog;
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
        dialog.renderWindow();
    }

}
