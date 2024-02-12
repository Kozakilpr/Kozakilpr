package lesson4.HoomWoork;

public class Task4 {
    public static void main(String[] args) {

        double[] temperatures = {1.5, 2, 4, 3, 4.5, 2.7, 0};


        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }


        double averageTemperature = sum / temperatures.length;


        System.out.println("Средняя температура за неделю: " + averageTemperature + " градусов Цельсия");
    }

}
