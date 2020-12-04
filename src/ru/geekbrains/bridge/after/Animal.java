package ru.geekbrains.bridge.after;

public abstract class Animal {

    protected MoveImplementor implementor;

    public Animal(MoveImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void move();

    public abstract void live();
}
