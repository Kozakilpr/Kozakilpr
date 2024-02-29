package HomeWork.W_02_23.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();

        // Добавляем пять пар слов в словарь
        dictionary.put("Weight", "вес");
        dictionary.put("dog", "собака");
        dictionary.put("house", "дом");
        dictionary.put("stack", "куча");
        dictionary.put("car", "машина");
        dictionary.put("Suit", "набор");

        // Выводим приветствие и инструкцию для пользователя
        System.out.println("Добро пожаловать в словарь перевода!");
        System.out.println("Введите слово на английском языке для перевода:");

        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine(); // Считываем слово

        // Проверяем, есть ли в словаре перевод для введенного слова
        if (dictionary.containsKey(word)) {
            // Если есть, выводим его перевод
            System.out.println("Перевод слова \"" + word + "\" на другой язык: " + dictionary.get(word));
        } else {
            // Если нет, сообщаем пользователю, что перевод не найден
            System.out.println("Перевод для слова \"" + word + "\" не найден в словаре.");
        }

        // Удаляем слово из словаря и выводим обновленный список слов
        System.out.println("Удаляем слово \"" + word + "\" из словаря...");
        dictionary.remove(word);
        System.out.println("Обновленный список слов в словаре:");
        System.out.println(dictionary);
    }
}
