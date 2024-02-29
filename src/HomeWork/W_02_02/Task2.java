package HomeWork.W_02_02;

public class Task2 {
        public static void main(String[] args) {

            int[] oddNumbers = new int[99];
            int number = 1;

            for (int i = 0; i < oddNumbers.length; i++) {
                oddNumbers[i] = number;
                number += 2;
            }


            for (int i = oddNumbers.length - 1; i >= 0; i--) {
                System.out.print(oddNumbers[i] + ".");
            }
        }
    }


