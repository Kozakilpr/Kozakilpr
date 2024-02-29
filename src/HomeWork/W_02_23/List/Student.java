package HomeWork.W_02_23.List;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения имен студентов
        ArrayList<String> studentList = new ArrayList<>();

        // Добавляем в список пять имен студентов
        studentList.add("Smetana");
        studentList.add("Verdi");
        studentList.add("Mozart");
        studentList.add("Lysenko");
        studentList.add("Bach");
        studentList.add("Puccini");

        // Выводим список студентов
        System.out.println("Список студентов:");
        System.out.println(studentList);

        // Выводим список студентов в обратном порядке
        System.out.println("Список студентов в обратном порядке:");
        Collections.reverse(studentList);
        System.out.println(studentList);

        // Удаляем студента из списка по индексу (например, второго студента)
        int indexToRemove = 2;
        if (indexToRemove >= 0 && indexToRemove < studentList.size()) {
            studentList.remove(indexToRemove);
        } else {
            System.out.println("Замена");
        }

        // Выводим обновленный список студентов
        System.out.println("Обновленный список студентов:");
        System.out.println(studentList);
    }
}
