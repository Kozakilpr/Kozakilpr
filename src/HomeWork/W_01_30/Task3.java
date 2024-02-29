package HomeWork.W_01_30;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Введите числа (для завершения введите отрицательное число):");

        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }

        System.out.println("Сумма введенных положительных чисел: " + sum);
    }
}
