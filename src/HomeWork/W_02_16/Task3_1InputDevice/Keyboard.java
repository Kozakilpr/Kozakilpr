package HomeWork.W_02_16.Task3_1InputDevice;

class Keyboard extends InputDevice {
    // Конструктор
    public Keyboard(String brand) {
        super(brand);
    }

    // Реализация методов connect и disconnect
    @Override
    public void connect() {
        System.out.println("Keyboard connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("Keyboard disconnected.");
    }
}



