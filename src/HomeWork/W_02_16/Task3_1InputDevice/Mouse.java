package HomeWork.W_02_16.Task3_1InputDevice;

class Mouse extends InputDevice {
    // Конструктор
    public Mouse(String brand) {
        super(brand);
    }

    // Реализация методов connect и disconnect
    @Override
    public void connect() {
        System.out.println("Mouse connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("Mouse disconnected.");
    }
}
