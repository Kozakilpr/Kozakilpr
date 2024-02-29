package HomeWork.W_02_09;

import java.util.Arrays;
import java.util.Collections;




public class Task3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 0;
        }


        System.out.println("Початковий масив: " + Arrays.toString(array));


        Arrays.sort(array, Collections.reverseOrder());


        System.out.println("Відсортований у зворотньому порядку: " + Arrays.toString(array));
    }
}

