package lesson9.homeWork;

public class Task22 {
    public static void main(String[] args) {

        int number1 = 42;
        int number2 = 13;
        int number3 = 19;
        int number4 = 85;

        int max1 = Math.max(number1, number2);
        int max2 = Math.max(number3, number4);
        int overallMax = Math.max(max1, max2);

        System.out.println("Максимальне число: " + overallMax);

    }
}
