package ru.geekbrains.decorator;

public class Tea implements Beverage {
    @Override
    public double getPrice() {
        return 40;
    }
}
