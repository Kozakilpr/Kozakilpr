package HomeWork.W_01_30;

public class Task4 {
    public static void main(String[] args) {
        // Определяем размер таблицы умножения
        int size = 10;

        // Внешний цикл для строк
        for (int i = 1; i <= size; i++) {
            // Внутренний цикл для столбцов
            for (int j = 1; j <= size; j++) {
                // Выводим произведение строки на столбец
                System.out.printf("%4d", i * j);
            }
            // Переходим на следующую строку после завершения столбцов
            System.out.println();
        }
    }
}
