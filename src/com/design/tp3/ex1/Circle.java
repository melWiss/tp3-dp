package com.design.tp3.ex1;

public class Circle extends Shape{
    Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        this.color.toColor();
        System.out.println(" Circle");
    }
}
