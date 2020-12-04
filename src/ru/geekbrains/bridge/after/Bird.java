package ru.geekbrains.bridge.after;

public class Bird extends Animal {

    public Bird(MoveImplementor implementor) {
        super(implementor);
    }

    @Override
    public void move() {
        implementor.move();
    }

    @Override
    public void live() {
        implementor.move();
        implementor.sleep();
    }
}
