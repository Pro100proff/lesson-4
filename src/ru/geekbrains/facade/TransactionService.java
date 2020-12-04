package ru.geekbrains.facade;

public interface TransactionService {
    boolean transferMoney(String fromCard, String toAccount, int sum);
}
