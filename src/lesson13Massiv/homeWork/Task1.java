package lesson13Massiv.homeWork;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] Task = new int[8];
        for (int i = 0; i < Task.length; i++) {
            Task[i] = (int) (Math.random() * 50) + 1;
        }


            System.out.println(Arrays.toString(Task));

        for (int i = 0; i < Task.length; i++) {

            if (Task[i] % 2 != 0) {
                Task[i] = 0;



            }

        }
        System.out.println(Arrays.toString(Task));

    }

}