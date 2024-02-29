package HomeWork.W_01_24;

public class Task1 {
    public static void main(String[] args) {

        String str = new String("I study Basic Java!");

        printLastCharacter(str);

        checkSubstring(str);

        replaceCharacters(str);

        convertToUpperCase(str);

        convertToLowerCase(str);

        cutSubstring(str);
    }

    private static void printLastCharacter(String str) {
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);
    }
    private static void checkSubstring(String str) {
        boolean containsJava = str.contains("Java");
        System.out.println("Содержит ли строка подстроку \"Java\": " + containsJava);
    }

    private static void replaceCharacters(String str) {
        String replacedStr = str.replace('a', 'o');
        System.out.println("Строка после замены символов: " + replacedStr);
    }

    private static void convertToUpperCase(String str) {
        String upperCaseStr = str.toUpperCase();
        System.out.println("Строка в верхнем регистру: " + upperCaseStr);
    }

    private static void convertToLowerCase(String str) {
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Строка в нижнем регистру: " + lowerCaseStr);
    }

    private static void cutSubstring(String str) {
        String cutStr = str.substring(str.indexOf("Java"), str.indexOf("Java") + 4);
        System.out.println("Подстрока \"Java\": " + cutStr);
    }
}
