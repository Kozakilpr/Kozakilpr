package HomeWork.W_01_23;


    import java.util.Scanner;

     public class Task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод двух слов с клавиатуры
            System.out.print("Введите первое слово: ");
            String word1 = scanner.next();
            System.out.print("Введите второе слово: ");
            String word2 = scanner.next();

            // Получение первой половины первого слова
            String firstHalfWord1 = word1.substring(0, word1.length() / 2);

            // Получение второй половины второго слова
            String secondHalfWord2 = word2.substring(word2.length() / 2);

            // Сборка нового слова из полученных половин
            String newWord = firstHalfWord1 + secondHalfWord2;

            // Проверка на четность длины нового слова
            if (newWord.length() % 2 != 0) {
                // Если длина нечетная, то убираем среднюю букву
                int middleIndex = newWord.length() / 2;
                newWord = newWord.substring(0, middleIndex) + newWord.substring(middleIndex + 1);
            }

            // Вывод нового слова на консоль
            System.out.println("Новое слово: " + newWord);
        }
    }


