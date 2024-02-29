package HomeWork.W_01_25___Urok8;

public class Task1BookApp {
    public static void main(String[] args) {
        // Создание объекта книги
        Task1Book book = new Task1Book("Тарас Шевченко", "Кобзарь", 399, 777, true);

        // Вывод информации о книге на консоль
        System.out.println("Информация о книге:");
        System.out.println(book);
    }
}

