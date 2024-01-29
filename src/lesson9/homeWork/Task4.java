package lesson9.homeWork;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();


        int grade = random.nextInt(12);

        int remainingTime = 45;

        switch (grade) {
            case 10:
            case 11:
            case 12:
                System.out.println("Ви дуже радієте за високу оцінку!");
                remainingTime += 60;
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Нейтральні слова про оцінку.");
                remainingTime += 45;
                break;
            case 3:
                System.out.println("Ви огорчені через оцінку.");
                remainingTime += 15;
                break;
            default:
                System.out.println("Трагедія. Сьогодні ТВ заборонено.");
                remainingTime = 0;
        }

        System.out.println("Залишений час для перегляду ТВ: " + remainingTime + " хвилин");
    }
}