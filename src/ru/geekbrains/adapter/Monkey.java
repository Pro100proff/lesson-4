package ru.geekbrains.adapter;

public class Monkey{

    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("лазить по деревьям");
    }

    public void speak(){
        System.out.println("бу бу бу " + name);
    }
}
