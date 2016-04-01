package com.gl051.oop;

public class Circle implements IShape {

    @Override
    public void Draw() {
        System.out.println("Drawing a Cirle");
    }

    @Override
    public void Erase() {
        System.out.println("Erasing a Cirle");
    }

}
