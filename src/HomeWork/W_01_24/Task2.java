package HomeWork.W_01_24;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух слов с клавиатуры
        System.out.println("Введите первое слово:");
        String word1 = scanner.next();

        System.out.println("Введите второе слово:");
        String word2 = scanner.next();

        // Получение слова из первой половины первого слова и второй половины второго слова
        String resultWord = getCombinedWord(word1, word2);
        System.out.println("Результирующее слово: " + resultWord);

        scanner.close();
    }

    // Метод для получения слова из первой половины первого слова и второй половины второго слова
    private static String getCombinedWord(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        // Получение индекса, с которого начинается вторая половина второго слова
        int startIndex2 = length2 / 2;

        // Получение первой половины первого слова
        String firstHalfWord1 = word1.substring(0, length1 / 2);

        // Получение второй половины второго слова
        String secondHalfWord2 = word2.substring(startIndex2);

        // Составление результирующего слова
        String resultWord = firstHalfWord1 + secondHalfWord2;

        // Если длина результирующего слова нечетная, убираем среднюю букву
        if (resultWord.length() % 2 != 0) {
            resultWord = resultWord.substring(0, resultWord.length() / 2) +
                    resultWord.substring(resultWord.length() / 2 + 1);
        }

        return resultWord;
    }
}
