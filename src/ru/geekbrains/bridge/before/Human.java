package ru.geekbrains.bridge.before;

public class Human implements Animal {

    @Override
    public void move() {
        System.out.println("поднимаю левую ногу");
        System.out.println("опуская левую ногу");
        System.out.println("поднимаю правую ногу");
        System.out.println("опускаю правую ногу");
    }
}
