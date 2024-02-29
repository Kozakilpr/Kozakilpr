package HomeWork.W_02_23.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        // Создаем ArrayList с дублирующимися элементами
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("apple");
        listWithDuplicates.add("banana");
        listWithDuplicates.add("apple");
        listWithDuplicates.add("orange");
        listWithDuplicates.add("banana");

        // Преобразуем ArrayList в HashSet, чтобы автоматически удалить дубликаты
        Set<String> setWithoutDuplicates = new HashSet<>(listWithDuplicates);

        // Выводим новый список без дубликатов
        System.out.println("Новый список без дубликатов:");
        for (String element : setWithoutDuplicates) {
            System.out.println(element);
        }

        // Добавляем новые элементы в HashSet
        setWithoutDuplicates.add("grape");
        setWithoutDuplicates.add("kiwi");

        // Преобразуем HashSet обратно в ArrayList
        List<String> newList = new ArrayList<>(setWithoutDuplicates);

        // Выводим обновленный список
        System.out.println("Обновленный список:");
        for (String element : newList) {
            System.out.println(element);
        }
    }
}
