package ru.geekbrains.bridge.after;

public class BirdMoveImpl implements MoveImplementor {
    @Override
    public void move() {
        System.out.println("махаю крыльями");
    }

    @Override
    public void sleep() {
        System.out.println("sleep..");
    }
}
