package HomeWork.W_02_16.Task3_3NavigationSystem;

public class NavigationSystemApp {
    public static void main(String[] args) {
        // Создание объектов систем навигации
        CarNavigationSystem carNavSystem = new CarNavigationSystem();
        MarineNavigationSystem marineNavSystem = new MarineNavigationSystem();

        // Использование методов навигации
        carNavSystem.startNavigation();
        carNavSystem.displayMap();
        carNavSystem.stopNavigation();

        marineNavSystem.startNavigation();
        marineNavSystem.displayMap();
        marineNavSystem.stopNavigation();
    }

}
