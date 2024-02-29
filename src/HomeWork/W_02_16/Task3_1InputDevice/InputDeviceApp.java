package HomeWork.W_02_16.Task3_1InputDevice;

public class InputDeviceApp {
    public static void main(String[] args) {
        // Создание объектов клавиатуры и мыши
        Keyboard keyboard = new Keyboard("Bimba");
        Mouse mouse = new Mouse("Logitech");

        // Подключение и отключение устройств
        keyboard.connect();
        keyboard.disconnect();

        mouse.connect();
        mouse.disconnect();

        // Вывод бренда устройств
        keyboard.printBrand();
        mouse.printBrand();
    }
}
