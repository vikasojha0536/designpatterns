package com.example.designpattern.factorypattern;

public class HtmlDialog extends AbstractDialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
