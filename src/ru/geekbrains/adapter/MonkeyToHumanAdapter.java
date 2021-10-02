package ru.geekbrains.adapter;

import java.util.ArrayList;
import java.util.List;

public class MonkeyToHumanAdapter extends Monkey implements Human {

    public MonkeyToHumanAdapter(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("придется идти на работу");
        move();
    }

    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        MonkeyToHumanAdapter monkeyAdapter = new MonkeyToHumanAdapter("Обезьяна");
        Monkey monkey = monkeyAdapter;
        humans.add(new Women("Анастасия"));
        humans.add(new Man("Сергей"));
        humans.add(monkeyAdapter);

        humans.forEach(Human::speak);


    }
}
