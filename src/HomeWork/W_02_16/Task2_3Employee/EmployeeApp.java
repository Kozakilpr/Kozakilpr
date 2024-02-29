package HomeWork.W_02_16.Task2_3Employee;

import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) {
        // Создаем менеджера
        Manager manager = new Manager("Petro Maer", 1, 4865);

        // Создаем разработчика с проектами
        String[] projects = {"Project A", "Project B", "Project C"};
        Developer developer = new Developer("Jurko Panches", 2, 4356, projects);

        // Добавляем разработчика в подчиненные менеджеру
        manager.addSubordinate(developer);

        // Выводим информацию о менеджере
        System.out.println("Manager: " + manager.getName());
        System.out.println("Salary: $" + manager.getSalary());
        System.out.println("Subordinates:");
        for (Employee emp : manager.getSubordinates()) {
            System.out.println("- " + emp.getName());
        }

        // Выводим информацию о разработчике
        System.out.println("\nDeveloper: " + developer.getName());
        System.out.println("Salary: $" + developer.getSalary());
        System.out.println("Projects: " + Arrays.toString(developer.getProjects()));
    }
}
