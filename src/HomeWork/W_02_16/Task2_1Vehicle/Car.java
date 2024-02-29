package HomeWork.W_02_16.Task2_1Vehicle;

public class Car extends Transport {
    private int numberOfDoors;

    public Car(String b, String m, int y, int numberOfDoors) {
        super(b, m, y);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}






