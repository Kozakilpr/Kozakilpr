package HomeWork.W_01_26___9Urok;

import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число від 1 до 7:");

        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
            case 7:
                System.out.println("Вихідний");
                break;
            default:
                System.out.println("Некоректне число. Введіть число від 1 до 7.");
        }
    }
}

