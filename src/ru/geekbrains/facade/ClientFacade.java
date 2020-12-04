package ru.geekbrains.facade;

public interface ClientFacade {

    boolean pay(String clientName, String fromCard, String toAccount, int amount);

    boolean withdrawMoney(String card, int amount);
}
