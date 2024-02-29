package HomeWork.W_02_16.Task3_3NavigationSystem;

class MarineNavigationSystem extends NavigationSystem {
    // Реализация методов для морской навигационной системы
    @Override
    public void startNavigation() {
        System.out.println("Marine navigation started, Остров КРК");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Marine navigation stopped, Остров Церс ");
    }
}
