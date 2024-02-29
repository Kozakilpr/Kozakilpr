package HomeWork.W_02_16.Task2_1Vehicle;

public class TransportDemo {
    public static void main(String[] args) {
        // Создаем объекты разных типов транспортных средств
        Transport transport1 = new Transport("Ford", "F 150", 2011);
        Car car1 = new Car("Ford", "F 150", 2011, 4);
        Bicycle bicycle1 = new Bicycle("Autor","Schnel",2023, "Sport");

        // Выводим информацию о каждом транспортном средстве
        System.out.println("Transport:");
        transport1.displayInfo();
        System.out.println();

        System.out.println("Car:");
        car1.displayInfo();
        System.out.println();

        System.out.println("Bicycle:");
        bicycle1.displayInfo();
    }
}




