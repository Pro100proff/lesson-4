package ru.geekbrains.composite;

import java.util.LinkedList;
import java.util.List;

public class Manager extends EmployeeComponent {
    private String name;

    private String department;

    private List<EmployeeComponent> subOrdinaries = new LinkedList<>();

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void print() {
        System.out.println("Отдел : " + department);
        System.out.println("Управляющий : " + name);
        System.out.println("--------------------------------");
        System.out.println("Подчинение :");
        subOrdinaries.forEach(EmployeeComponent::print);
    }

    @Override
    public void sleepOnWork() {
        System.out.println("На самом деле я не сплю, я работаю");

        try {
            subOrdinaries.forEach(EmployeeComponent::sleepOnWork);
        } catch (Exception e) {

        }
    }

    @Override
    public void addChild(EmployeeComponent e) {
        subOrdinaries.add(e);
    }

    @Override
    public void removeChild(int index) {
        subOrdinaries.remove(index);
    }
}
