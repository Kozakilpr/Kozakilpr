package HomeWork.W_02_16.Task2_3Employee;

import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Employee> subordinates;

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee emp) {
        subordinates.add(emp);
    }

    public void removeSubordinate(Employee emp) {
        subordinates.remove(emp);
    }

    public ArrayList<Employee> getSubordinates() {
        return subordinates;
    }
}
