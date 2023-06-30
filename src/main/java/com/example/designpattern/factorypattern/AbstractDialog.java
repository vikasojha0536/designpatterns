package com.example.designpattern.factorypattern;

public abstract class AbstractDialog {

    public void renderWindow() {
        Button button = createButton();
         button.render();
         // or
        // button.onClick();
    }

    public abstract Button createButton();

}
