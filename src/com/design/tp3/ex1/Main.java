package com.design.tp3.ex1;

public class Main {
    public static void main(String[] args) {
        Shape a = new Square(new Red());
        Shape b = new Circle(new Blue());
        a.applyColor();
        b.applyColor();
    }
}
