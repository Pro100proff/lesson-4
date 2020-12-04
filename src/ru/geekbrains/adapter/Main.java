package ru.geekbrains.adapter;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new LinkedList<>();
        humans.add(new Women("Анастасия"));
        humans.add(new Women("Анна"));

        Monkey monkey = new Monkey("Monkey");

        humans.add(new MonkeyToHumanAnotherAdapter(monkey));

        humans.forEach(Human::speak);
        System.out.println("----------------");
        humans.forEach(Human::work);
    }
}
