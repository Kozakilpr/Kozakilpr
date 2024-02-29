package HomeWork.W_02_16.Task3_1InputDevice;

abstract class InputDevice {
    // Поля, общие для всех устройств ввода
    private String brand;

    // Конструктор
    public InputDevice(String brand) {
        this.brand = brand;
    }

    // Абстрактные методы
    public abstract void connect();

    public abstract void disconnect();

    // Метод, который не является абстрактным
    public void printBrand() {
        System.out.println("Brand: " + brand);
    }
}


