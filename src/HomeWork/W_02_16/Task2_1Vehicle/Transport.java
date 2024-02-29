package HomeWork.W_02_16.Task2_1Vehicle;


class Transport {
    protected String brand;
    protected String model;
    protected int year;


    public Transport(String b, String m, int y) {
        this.brand = b;
        this.model = m;
        this.year = y;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }


}




