package lesson13Massiv.homeWork;



import java.util.Arrays;

public class Task22 {
    public static int length;

    public static void main(String[] args) {
        // Создаем массив из 5 случайных целых чисел от 10 до 99
        int[] Task22 = new int[5];
        for (int i = 0; i < Task22.length; i++) {

            Task22[i] = (int) (Math.random() * 90) + 10; // Генерация чисел от 10 до 99
        }

        // Выводим массив на консоль в строку
        System.out.println("Массив: " + Arrays.toString(Task22));

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i <Task22.length; i++) {
            if (Task22[i] <= Task22[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        // Выводим результат на экран
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
