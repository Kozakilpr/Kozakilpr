package HomeWork.W_02_02;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
        public static void main(String[] args) {

            String[] words = {"Берлин", "Гановер", "Мюнхен", "Бонн", "Одеса", "Варшава", "Франфуркт"};


            ArrayList<String> oddLengthWords = new ArrayList<>();
            ArrayList<String> evenLengthWords = new ArrayList<>();


            for (String word : words) {
                if (word.length() % 2 == 0) {
                    evenLengthWords.add(word);
                } else {
                    oddLengthWords.add(word);
                }
            }


            System.out.println("Слова с нечетным количеством букв: " + Arrays.toString(oddLengthWords.toArray()));
            System.out.println("Слова с четным количеством букв: " + Arrays.toString(evenLengthWords.toArray()));
        }
    }


