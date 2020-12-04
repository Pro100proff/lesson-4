package ru.geekbrains.bridge;

import ru.geekbrains.bridge.after.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new LinkedList<>();
        MoveImplementor implementor = new UpRightMove();
        MoveImplementor fishImplentor = new FishMoveImplementor();
        animals.add(new Lemur(implementor));
        animals.add(new Human(implementor));
        animals.add(new Fish(fishImplentor));

        animals.forEach(a -> {
            System.out.println("---------");
            a.live();
        });
    }
}
