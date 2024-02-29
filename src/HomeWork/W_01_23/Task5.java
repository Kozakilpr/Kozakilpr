package HomeWork.W_01_23;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // Вывод результатов
        System.out.println("Результат сложения: " + add(num1, num2));
        System.out.println("Результат вычитания: " + subtract(num1, num2));
        System.out.println("Результат умножения: " + multiply(num1, num2));
        System.out.println("Результат деления: " + divide(num1, num2));

        scanner.close();
        }

        // Метод сложения
        public static double add(double a, double b) {
            return a + b;
        }

        // Метод вычитания
        public static double subtract(double a, double b) {
            return a - b;
        }

        // Метод умножения
        public static double multiply(double a, double b) {
            return a * b;
        }

        // Метод деления
        public static double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Ошибка: деление на ноль");
                return Double.NaN; // Возвращаем NaN (Not a Number) в случае деления на ноль
            } else {
                return a / b;
            }
        }
    }


