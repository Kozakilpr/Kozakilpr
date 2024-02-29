package HomeWork.W_02_09;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner slowo = new Scanner(System.in);

        System.out.println("Введите слова");
        String input = slowo.nextLine();
        int count = 0;
        if (input.length() != 0){
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;



                }

            }
        }
        System.out.println("Вы ввели " + count + " Слова");
    }

}
