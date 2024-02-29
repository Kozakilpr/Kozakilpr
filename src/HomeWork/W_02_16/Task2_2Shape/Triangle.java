package HomeWork.W_02_16.Task2_2Shape;

class Triangle extends Shape {
    private double base;   // Основание треугольника
    private double height; // Высота треугольника


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
