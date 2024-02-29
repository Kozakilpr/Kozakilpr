package HomeWork.W_02_09;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n;
        do {
            System.out.print("Ввести размер масива (больше 3): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Неправильное значение. Ввести натуральное число.");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 3);

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
        }

        System.out.println("Начальный масив:");
        printArray(array);

        int[] evenArray = extractEvenNumbers(array);
        System.out.println("Масив з четными елементами:");
        printArray(evenArray);
    }


    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    public static int[] extractEvenNumbers(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                count++;
            }
        }

        int[] evenArray = new int[count];
        int index = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenArray[index++] = element;
            }
        }

        return evenArray;
    }

}
