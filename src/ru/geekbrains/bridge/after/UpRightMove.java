package ru.geekbrains.bridge.after;

public class UpRightMove implements MoveImplementor {
    @Override
    public void move() {
        System.out.println("поднимаю левую ногу");
        System.out.println("опуская левую ногу");
        System.out.println("поднимаю правую ногу");
        System.out.println("опускаю правую ногу");
    }

    @Override
    public void speak() {
        System.out.println("Говорю");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю");
    }
}
