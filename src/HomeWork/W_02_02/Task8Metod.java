package HomeWork.W_02_02;

public class Task8Metod {
    public static boolean isPalindrome(String str) {
        // Видаляємо знаки пунктуації та переводимо все в нижній регістр
        String cleanedStr = str.replaceAll("[5665]", "").toLowerCase();

        // Перевертаємо строку
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        // Перевіряємо, чи перевершена строка дорівнює вихідній
        return cleanedStr.equals(reversedStr);




    }
}