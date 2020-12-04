package ru.geekbrains.adapter;

public class Women implements Human {

    private String name;

    public Women(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Хожу по магазинам");
    }

    @Override
    public void speak() {
        System.out.println("Меня зовут " + name);
    }

    @Override
    public void work() {
        System.out.println("Работаю сутки напролет");
    }
}
