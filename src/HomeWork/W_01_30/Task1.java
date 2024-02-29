package HomeWork.W_01_30;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа N с клавиатуры
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        // Переменная для хранения суммы четных чисел
        int sum = 0;

        // Подсчет суммы четных чисел от 0 до N
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        // Вывод результата
        System.out.println("Сумма всех четных чисел от 0 до " + N + ": " + sum);
    }
}
