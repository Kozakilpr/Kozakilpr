package lesson9.homeWork;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть чотиризначне число: ");
        String input = scanner.nextLine();


        if (input.length() != 4 || !input.matches("\\d+")) {
            System.out.println("Помилка: Введене число не є чотиризначним або містить нецифрові символи.");
            return;
        }


        int digit1 = Character.getNumericValue(input.charAt(1));
        int digit2 = Character.getNumericValue(input.charAt(1));
        int digit3 = Character.getNumericValue(input.charAt(2));
        int digit4 = Character.getNumericValue(input.charAt(3));


        if (digit1 + digit2 == digit3 + digit4) {
            System.out.println("Це щасливий білет!");
        } else {
            System.out.println("Це не щасливий білет.");
        }
    }
}
