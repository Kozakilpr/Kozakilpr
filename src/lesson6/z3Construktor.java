package lesson6;
public class z3Construktor {
    public static void main(String[] args) {

        int diameterPizza1 = 24;

        int diameterPizza2 = 28;
        int diameterPizza3 = 34;

        int caloriesInOneCm = 40;
        int caloriesInSecondCm = 40;

        double caloriesPizza1 = caloriesInOneCm * Math.PI * (diameterPizza1 * diameterPizza1) / 4;
        double caloriesPizza2 = caloriesInOneCm * Math.PI * (diameterPizza3 * diameterPizza3) / 4;

        double caloriesPizza3 = caloriesInOneCm * Math.PI * (diameterPizza2 * diameterPizza2) / 4;

        double extraCalories1 = caloriesPizza2 - caloriesPizza1;
        double extraCalories2 = caloriesPizza3 - caloriesPizza2;
        double extraCalories3 = caloriesPizza3 - caloriesPizza1;

        System.out.println("Количество лишних калорий: " + extraCalories1 + extraCalories2 );
        System.out.println("Количество лишних калорий: " + extraCalories3 + extraCalories1 );
    }
}


