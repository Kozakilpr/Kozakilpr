package HomeWork.W_02_16.Task2_2Shape;

public class ShapeApp {
    public static void main(String[] args) {
        // Создание объектов Circle, Rectangle и Triangle
        Circle circle = new Circle(8);
        Rectangle rectangle = new Rectangle(5, 7);
        Triangle triangle = new Triangle(8, 12);

        // Вычисление и вывод площадей каждой фигуры
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
    }
}
