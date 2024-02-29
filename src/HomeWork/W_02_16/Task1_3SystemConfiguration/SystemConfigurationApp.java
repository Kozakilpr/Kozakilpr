package HomeWork.W_02_16.Task1_3SystemConfiguration;

public class SystemConfigurationApp {
    public static void main(String[] args) {
        // Создание объекта SystemConfiguration с начальными параметрами
        SystemConfiguration config = new SystemConfiguration(3, "/var/log/application.log");

        // Изменение уровня логирования
        config.setLogLevel(5);

        // Попытка установить некорректный уровень логирования
        config.setLogLevel(9);

        // Изменение пути к файлам логов
        config.setLogFilePath("/var/log/myapp.log");
    }

}
