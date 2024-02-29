package HomeWork.W_02_02;

import java.util.Arrays;

public class Task1 {
           public static void main(String[] args) {

            int[] arr1 = {1, 2, 3, 5};
            int missingElement1 = findMissingElement(arr1);
            System.out.println("Missing element in " + Arrays.toString(arr1) + ": " + missingElement1);

            int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
            int missingElement2 = findMissingElement(arr2);
            System.out.println("Missing element in " + Arrays.toString(arr2) + ": " + missingElement2);
        }

        static int findMissingElement(int[] arr) {
            int n = arr.length + 1; // Размер массива должен быть на 1 больше, чем количество элементов
            int totalSum = n * (n + 1) / 2; // Сумма первых n натуральных чисел по формуле

            int actualSum = Arrays.stream(arr).sum(); // Сумма элементов в массиве

            return totalSum - actualSum; // Недостающий элемент
        }


}
