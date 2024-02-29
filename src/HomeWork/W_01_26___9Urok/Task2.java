package HomeWork.W_01_26___9Urok;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(99);
        int number2 = random.nextInt(10);
        int number3 = random.nextInt(55);
        int number4 = random.nextInt(6);

        System.out.println("Число 1: " + number1);
        System.out.println("Число 2: " + number2);
        System.out.println("Число 3: " + number3);
        System.out.println("Число 4: " + number4);



    }
}
