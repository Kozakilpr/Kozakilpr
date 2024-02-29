package HomeWork.W_02_16.Task2_3Employee;

public class Developer extends Employee {
    private String[] projects;

    public Developer(String name, int id, double salary, String[] projects) {
        super(name, id, salary);
        this.projects = projects;
    }

    public String[] getProjects() {
        return projects;
    }
}


