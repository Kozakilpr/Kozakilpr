package HomeWork.W_01_23;

public class Task1 {

        public static void main(String[] args) {
            // Создание строки через new
            String str = new String("I study Basic Java!");

            // Вызов метода, который принимает строку в качестве параметра
            printLastCharacter(str);

            // Проверка наличия подстроки "Java"
            boolean containsJava = str.contains("Java");
            System.out.println("Строка содержит подстроку \"Java\": " + containsJava);

            // Замена всех символов 'а' на 'о'
            String replacedStr = str.replace('a', 'o');
            System.out.println("Строка после замены символов: " + replacedStr);

            // Преобразование строки к верхнему регистру
            String upperCaseStr = str.toUpperCase();
            System.out.println("Строка в верхнем регистре: " + upperCaseStr);

            // Преобразование строки к нижнему регистру
            String lowerCaseStr = str.toLowerCase();
            System.out.println("Строка в нижнем регистре: " + lowerCaseStr);

            // Вырезание подстроки "Java"
            String substring = str.substring(str.indexOf("Java"), str.indexOf("Java") + "Java".length());
            System.out.println("Вырезанная подстрока: " + substring);
        }

        // Метод для вывода последнего символа строки
        public static void printLastCharacter(String str) {
            char lastChar = str.charAt(str.length() - 1);
            System.out.println("Последний символ строки: " + lastChar);
        }
    }


