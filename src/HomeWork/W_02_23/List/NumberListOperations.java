package HomeWork.W_02_23.List;

import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

public class NumberListOperations {
    public static void main(String[] args) {
        // Создание LinkedList для хранения целых чисел
        LinkedList<Integer> numberList = new LinkedList<>();

        // Добавление случайных чисел в список в диапазоне от 1 до 100
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numberList.add(randomNumber);
        }

        // Вывод списка случайных чисел
        System.out.println("Список случайных чисел:");
        System.out.println(numberList);

        // Поиск и вывод максимального и минимального чисел в списке
        int maxNumber = Collections.max(numberList);
        int minNumber = Collections.min(numberList);
        System.out.println("\nМаксимальное число в списке: " + maxNumber);
        System.out.println("Минимальное число в списке: " + minNumber);

        // Сортировка списка в порядке возрастания и вывод его
        Collections.sort(numberList);
        System.out.println("\nСписок чисел после сортировки в порядке возрастания:");
        System.out.println(numberList);
    }
}
