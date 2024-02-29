package HomeWork.W_01_31;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Введите несколько чисел. Для завершения введите 0.");

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Сумма чисел: " + sum);
            System.out.println("Среднее арифметическое: " + average);
        } else {
            System.out.println("Вы не ввели ни одного числа.");
        }
    }

}
