package HomeWork.W_02_16.Task2_2Shape;

class Rectangle extends Shape {
    private double width;  // Ширина прямоугольника
    private double height; // Высота прямоугольника

    // Конструктор класса Rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Реализация метода calculateArea для прямоугольника
    @Override
    double calculateArea() {
        return width * height;
    }
}
