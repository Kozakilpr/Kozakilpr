package lesson14.WorkHoom;

import static lesson14.WorkHoom.Task8Metod.isPalindrome;

public class Task8 {

        public static void main(String[] args) {
            String input = "ssoboss";

            if (isPalindrome(input)) {
                System.out.println("Строка є паліндромом.");
            } else {
                System.out.println("Строка не є паліндромом.");
            }
        }


    }


