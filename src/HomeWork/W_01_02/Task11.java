package HomeWork.W_01_02;

import java.util.Arrays;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        // Создаем массив из 8 случайных целых чисел из интервала [1;50]
        int[] Task11 = new int[8];
        Random random = new Random();
        for (int i = 0; i < Task11.length; i++) {
            Task11[i] = random.nextInt(50) + 1;
        }

        // Выводим массив на консоль в строку
        System.out.println(       "Исходный массив: " + Arrays.toString(Task11));

        // Заменяем каждый элемент с нечетным индексом на ноль
        for (int i = 1; i < Task11.length; i += 2) {
            Task11[i] = 0;
        }

        // Выводим массив на консоль в отдельной строке после замены
        System.out.println("Массив после замены: " + Arrays.toString(Task11));
    }
}


