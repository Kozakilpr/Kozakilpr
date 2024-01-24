package z3Pizza;

public class z3Pizza {
    public static void main(String[] args) {

        int diameterPizza1 = 24;

        int diameterPizza2 = 28;

        int caloriesInOneCm = 40;

        double caloriesPizza1 = caloriesInOneCm * Math.PI * (diameterPizza1 * diameterPizza1) / 4;

        double caloriesPizza2 = caloriesInOneCm * Math.PI * (diameterPizza2 * diameterPizza2) / 4;

        double extraCalories = caloriesPizza2 - caloriesPizza1;

        System.out.println("Количество лишних калорий: " + extraCalories);
    }

}