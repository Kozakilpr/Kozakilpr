package HomeWork.W_02_16.Task3_3NavigationSystem;

abstract class NavigationSystem {
    // Абстрактные методы для старта и завершения навигации
    public abstract void startNavigation();

    public abstract void stopNavigation();

    // Общий метод для всех систем навигации
    public void displayMap() {
        System.out.println("Екран");
    }
}