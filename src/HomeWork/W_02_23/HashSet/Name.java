package HomeWork.W_02_23.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Name {
    public static void main(String[] args) {

        Set<String> namesSet = new HashSet<>();

        // Добавляем в набор десять имен
        namesSet.add("Анна");
        namesSet.add("Иван");
        namesSet.add("Мария");
        namesSet.add("Игорь");
        namesSet.add("Андрей");
        namesSet.add("Мария");
        namesSet.add("Петр");
        namesSet.add("Наталья");
        namesSet.add("Андрей");
        namesSet.add("Ольга");

        // Выводим количество уникальных имен в наборе
        System.out.println("Количество уникальных имен: " + namesSet.size());

        // Проверяем, содержит ли набор определенное имя
        String searchName = "Анна";
        if (namesSet.contains(searchName)) {
            System.out.println("Набор содержит имя " + searchName);
        } else {
            System.out.println("Набор не содержит имя " + searchName);
        }
    }
}
