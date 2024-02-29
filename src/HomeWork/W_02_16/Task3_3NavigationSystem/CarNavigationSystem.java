package HomeWork.W_02_16.Task3_3NavigationSystem;

class CarNavigationSystem extends NavigationSystem {
    // Реализация методов для автомобильной навигационной системы
    @Override
    public void startNavigation() {
        System.out.println("Car navigation started.Hamburg");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Car navigation stopped. Kyiv");
    }
}
