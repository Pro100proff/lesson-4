package ru.geekbrains.bridge.after;

import ru.geekbrains.bridge.Animal;

public class Parrot extends AbstractAnimal {

    public Parrot(MoveImplementor implementor) {
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
