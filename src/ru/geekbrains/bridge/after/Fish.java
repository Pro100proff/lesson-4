package ru.geekbrains.bridge.after;

public class Fish extends Animal {

    public Fish(MoveImplementor implementor) {
        super(implementor);
    }

    @Override
    public void move() {
        implementor.move();
    }

    @Override
    public void live() {
        implementor.move();
        implementor.speak();
    }
}
