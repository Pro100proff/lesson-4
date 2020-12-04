package ru.geekbrains.bridge.before;

public class Bird implements Animal{

    @Override
    public void move() {
        System.out.println("Взмах крылом вверху");
        System.out.println("Взмах крылом вниз");
    }
}
