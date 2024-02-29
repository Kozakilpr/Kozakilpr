package HomeWork.W_02_09;

import static lesson19.HoomWork.Task1.Task1;

public class Task11 {
    public static void main(String[] args) {
        // Оголошуємо ініціалізуємо масив
        String[] array = {"1", "2", "3", "4", "5"};

        // Виводимо початковий масив
        System.out.println();


        // Змінюємо місцями елементи масиву у зворотньому порядку
        for (int i = 0; i < array.length /2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        // Виводимо масив після зміни місцями
        System.out.println("массива в обратном порядке:");
        Task1(array);

}}
