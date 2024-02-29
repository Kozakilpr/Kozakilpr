package HomeWork.W_01_23;

public class Task3 {

        public static void main(String[] args) {
            // Диаметры пицц
            int diameter1 = 24; // в см
            int diameter2 = 28; // в см

            // Площади пицц
            double area1 = calculatePizzaArea(diameter1);
            double area2 = calculatePizzaArea(diameter2);

            // Калории в каждой пицце
            int caloriesPerSquareCentimeter = 40;
            double calories1 = area1 * caloriesPerSquareCentimeter;
            double calories2 = area2 * caloriesPerSquareCentimeter;

            // Разница в количестве лишних калорий
            double extraCalories = calories2 - calories1;

            // Вывод результата
            System.out.println("Разница в количестве лишних калорий: " + extraCalories + " калорий");
        }

        // Метод для вычисления площади пиццы по диаметру
        public static double calculatePizzaArea(int diameter) {
            double radius = diameter / 2.0;
            return Math.PI * radius * radius; // Формула площади круга: PI * r^2
        }
    }


