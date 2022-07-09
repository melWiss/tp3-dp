package com.design.tp3.ex1;

public class Square extends Shape{
    Square(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        this.color.toColor();
        System.out.println(" Square");
    }
}
