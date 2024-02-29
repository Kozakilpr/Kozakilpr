package HomeWork.W_02_16.Task1_3SystemConfiguration;

public class SystemConfiguration {
    private int logLevel; // Уровень логирования
    private String logFilePath; // Путь к файлам логов

    // Конструктор для создания объекта SystemConfiguration с начальными значениями
    public SystemConfiguration(int logLevel, String logFilePath) {
        this.logLevel = logLevel;
        this.logFilePath = logFilePath;
    }




    public void setLogLevel(int logLevel) {
        // Проверка на допустимые значения уровня логирования (например, от 1 до 5)
        if (logLevel >= 4 && logLevel <= 7) {
            this.logLevel = logLevel;
        } else {
            System.out.println("Неверный уровень журнала. Уровень журнала должен быть между 1 и 5.");
        }
    }



    public void setLogFilePath(String logFilePath) {
        // Здесь можно добавить дополнительные проверки на корректность пути к файлам логов
        this.logFilePath = logFilePath;
    }


}
