package HomeWork.W_01_30;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int evenCount = 0; // Счетчик четных чисел
        int oddCount = 0;  // Счетчик нечетных чисел

        // Подсчет четных и нечетных чисел в диапазоне от 0 до N
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                evenCount++; // Увеличиваем счетчик четных чисел
            } else {
                oddCount++; // Увеличиваем счетчик нечетных чисел
            }
        }

        // Вывод результатов
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количество нечетных чисел: " + oddCount);

        scanner.close();
    }

}
