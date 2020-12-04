package ru.geekbrains.bridge.after;

public class Human extends Animal {

    public Human(MoveImplementor implementor) {
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
        implementor.sleep();
    }
}
