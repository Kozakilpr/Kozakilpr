package HomeWork.W_02_09;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] array1 = generateRandomArray(5, 0, 5);
        int[] array2 = generateRandomArray(5, 0, 5);


        System.out.println("Массив 1: " + arrayToString(array1));
        System.out.println("Массив 2: " + arrayToString(array2));


        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);


        if (average1 > average2) {
            System.out.println("Среднее арифметич. значение для масива 1 больше: " + average1);
        } else if (average1 < average2) {
            System.out.println("Среднее арифметич. значение для масива 2 больше: " + average2);
        } else {
            System.out.println("Среднее арифметич. значение для обох масивов: " + average1);
        }
    }


    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }


    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }


    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
