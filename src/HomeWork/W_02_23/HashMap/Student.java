package HomeWork.W_02_23.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {

        Map<String, Double> studentGrades = new HashMap<>();

        // Добавляем данные пяти студентов
        studentGrades.put("Volter", 4.5);
        studentGrades.put("Mauer", 3.8);
        studentGrades.put("Scholz", 4.2);
        studentGrades.put("Sidorenko", 4.9);
        studentGrades.put("Machmud", 4.1);

        // Находим студента с наивысшим средним баллом
        String topStudent = "";
        double maxGrade = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() > maxGrade) {
                topStudent = entry.getKey();
                maxGrade = entry.getValue();
            }
        }

        // Выводим имя студента с наивысшим средним баллом
        System.out.println("Студент с наивысшим средним баллом: " + topStudent + " (" + maxGrade + ")");

        // Изменяем средний балл одного из студентов
        studentGrades.put("Mauer", 4.7);

        // Выводим обновленные данные о студентах
        System.out.println("Обновленные данные о студентах:");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
