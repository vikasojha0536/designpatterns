package com.example.designpattern.factorypattern;

public class WindowDialog extends AbstractDialog{

    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
