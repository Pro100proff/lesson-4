package ru.geekbrains.bridge.after;

public class FishMoveImplementor implements MoveImplementor {
    @Override
    public void move() {
        System.out.println("-- -- ----");
    }

    @Override
    public void speak() {
        System.out.println("говорю");
    }

    @Override
    public void sleep() {
        System.out.println("сплю");
    }
}
