package lesson14.WorkHoom;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {

                public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть розмір масиву: ");
            int size = scanner.nextInt();

            int[] array = generateRandomArray(size);

            System.out.println("Масив: " + Arrays.toString(array));

            int maxElement = findMaxElement(array);
            int maxElementIndex = findMaxElementIndex(array);
            int sum = calculateSum(array);

            System.out.println("Максимальний елемент: " + maxElement);
            System.out.println("Індекс максимального елемента: " + maxElementIndex);
            System.out.println("Сума всіх елементів: " + sum);

            if (countOccurrences(array, maxElement) > 1) {
                int[] indexesOfMaxElement = findIndexesOfElement(array, maxElement);
                System.out.println("Індекси повторюваного максимального елемента: " + Arrays.toString(indexesOfMaxElement));
            }
        }

        private static int[] generateRandomArray(int size) {
            Random random = new Random();
            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(100);
            }

            return array;
        }

        private static int findMaxElement(int[] array) {
            int maxElement = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxElement) {
                    maxElement = array[i];
                }
            }
            return maxElement;
        }

        private static int findMaxElementIndex(int[] array) {
            int maxElement = array[0];
            int maxIndex = 0;

            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxElement) {
                    maxElement = array[i];
                    maxIndex = i;
                }
            }

            return maxIndex;
        }

        private static int calculateSum(int[] array) {
            int sum = 0;
            for (int value : array) {
                sum += value;
            }
            return sum;
        }

        private static int countOccurrences(int[] array, int target) {
            int count = 0;
            for (int value : array) {
                if (value == target) {
                    count++;
                }
            }
            return count;
        }

        private static int[] findIndexesOfElement(int[] array, int target) {
            int count = countOccurrences(array, target);
            int[] indexes = new int[count];
            int currentIndex = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    indexes[currentIndex++] = i;
                }
            }

            return indexes;
        }
    }


