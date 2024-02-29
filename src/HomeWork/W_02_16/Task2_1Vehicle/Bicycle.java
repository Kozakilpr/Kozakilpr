package HomeWork.W_02_16.Task2_1Vehicle;

public class Bicycle extends Transport {
    private String Sport;

    public Bicycle(String b, String m, int y, String sport) {
        super(b, m, y);
        Sport = sport;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + Sport);
    }
    }





