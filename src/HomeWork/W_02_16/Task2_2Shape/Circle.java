package HomeWork.W_02_16.Task2_2Shape;

class Circle extends Shape {
    private double radius; // Радиус круга


    public Circle(double radius) {
        this.radius = radius;
    }

    // Реализация метода calculateArea для круга
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
