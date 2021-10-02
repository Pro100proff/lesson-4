package ru.geekbrains.decorator;

public class TeaWithMilk extends Tea{
    @Override
    public double getPrice() {
        return 20 + super.getPrice();
    }
}
