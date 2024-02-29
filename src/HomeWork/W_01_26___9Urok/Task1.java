package HomeWork.W_01_26___9Urok;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "ввести число на выбор: 1, 2 или 3");
        int userNumber = scanner.nextInt();
        switch (userNumber){
            case 1:
                System.out.println("Ви ввели число 1");
                break;
            case 2:
                System.out.println("Ви ввели число 2");
                break;
            case 3:
                System.out.println("Ви ввели число 3");
                break;
            default:
                System.out.println("Введене число не є 1, 2 або 3");

                scanner.close();
        }

    }
}