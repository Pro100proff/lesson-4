package ru.geekbrains.decorator;

public class CoffeeWithMilk extends Coffee{
    @Override
    public double getPrice() {
        return 10 + super.getPrice();
    }
}
