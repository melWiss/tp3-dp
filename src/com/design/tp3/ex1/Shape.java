package com.design.tp3.ex1;

public abstract class Shape {
    protected Color color;
    Shape(Color color){
        this.color = color;
    };

    abstract void applyColor();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
