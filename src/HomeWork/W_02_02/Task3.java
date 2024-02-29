package HomeWork.W_02_02;

import java.util.Random;

public class Task3 {
    /*Создайте массив из 15 случайных целых чисел из отрезка [0;9].
    Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.*/
        public static void main(String[] args) {
            // Создаем массив из 15 случайных целых чисел от 0 до 9
            int[] numbers = new int[15];
            Random random = new Random();

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(9);
            }

            // Подсчитываем количество четных элементов
            int evenCount = 0;
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenCount++;
                }
            }

            // Выводим количество четных элементов на экран
            System.out.println("Количество четных элементов: " + evenCount);
        }
    }


