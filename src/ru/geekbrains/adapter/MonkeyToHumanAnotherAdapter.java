package ru.geekbrains.adapter;

public class MonkeyToHumanAnotherAdapter implements Human {

    private Monkey monkey;

    public MonkeyToHumanAnotherAdapter(Monkey monkey) {
        this.monkey = monkey;
    }

    @Override
    public void move() {
        monkey.move();
    }

    @Override
    public void speak() {
        monkey.speak();
    }

    @Override
    public void work() {
        System.out.println("собирать бананы с деревьев");
        monkey.move();
    }
}
