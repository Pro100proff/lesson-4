package ru.geekbrains.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Sugar(new Milk(new Coffee()));
        System.out.println("coffee price = " + beverage.getPrice());

        Beverage tea = new Milk(new Tea());
        System.out.println("tea price = " + tea.getPrice());
    }
}
