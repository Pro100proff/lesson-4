package ru.geekbrains.bridge.after;

public class Lemur extends Animal {

    public Lemur(MoveImplementor implementor) {
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
