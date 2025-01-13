package codesmells.employeeManager;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private final List<String> employees = new ArrayList<>();
    private final String loggerLevel = "DEBUG";

    public void addEmployee(String name) {
        if (name.length() > 0) {
            employees.add(name);
        } else {
            System.out.println("Invalid name!");
        }
    }

    public void processSalaries() {
        for (int i = 0; i < employees.size(); i++) {
            String emp = employees.get(i);
            System.out.println("Processing salary for " + emp);
        }
    }

    public void log(String message) {
        if (loggerLevel.equals("DEBUG")) {
            System.out.println("[DEBUG]: " + message);
        }
        if (loggerLevel.equals("ERROR")) {
            System.err.println("[ERROR]: " + message);
        }
    }

    public void performComplexOperation() {
        System.out.println("Starting complex operation...");
        for (String employee : employees) {
            System.out.println("Calculating for: " + employee);
            int x = new EmployeeCalculator().calculate(employee);
            System.out.print("Processed salary for: " + employee);
            System.out.println(" is" + x);
        }
        System.out.println("Complex operation finished.");
    }
}
