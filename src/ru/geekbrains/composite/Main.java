package ru.geekbrains.composite;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EmployeeComponent> composite = new LinkedList<>();
        EmployeeComponent ceo = new Manager(
                "Владимир Владимирович Путин",
                "Глава"
        );
        EmployeeComponent subManager = new Manager(
                "Мишустин Михаил Владимирович",
                "ФСБ"
        );
        EmployeeComponent subManager2 = new Manager(
                "Герман Греф",
                "Финансы"
        );
        ceo.addChild(subManager);
        ceo.addChild(subManager2);
        EmployeeComponent developer1 = new Developer(
                "Нестеренко Дмитрий Олегович",
                "Senior Java Developer"
        );
        EmployeeComponent developer2 = new Developer(
                "Ивано Иван Иванович",
                "Тестеровщик"
        );
        subManager.addChild(developer1);
        subManager.addChild(developer2);

        EmployeeComponent financialDeveloper = new Developer(
                "Иванов Сергей",
                "Senior Java Developer"
        );
        EmployeeComponent financialTester = new Developer(
                "Иванов Алексей",
                "Тестеровщик"
        );
        subManager2.addChild(financialDeveloper);
        subManager2.addChild(financialTester);
//        ceo.print();

        ceo.sleep();
    }
}
