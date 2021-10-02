package ru.geekbrains.bridge.after;

import ru.geekbrains.bridge.Animal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MoveImplementor twolegs = new TwoLegsMoveImpl();
        MoveImplementor fourlegs = new FourLegsMoveImpl();
        MoveImplementor birdMove = new BirdMoveImpl();

        AbstractAnimal monkey = new Monkey(fourlegs);
        AbstractAnimal tiger = new Tiger(fourlegs);
        AbstractAnimal parrot = new Parrot(birdMove);
        AbstractAnimal seagle = new Seagle(birdMove);

        List<AbstractAnimal> animals = List.of(monkey, tiger, parrot, seagle);
        animals.forEach(AbstractAnimal::live);
    }
}
