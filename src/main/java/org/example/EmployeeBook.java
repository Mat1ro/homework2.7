package org.example;

import java.util.*;

public class EmployeeBook {

    Map<String, Employee> employees = new HashMap<>();

    public EmployeeBook() {
        employees.put("Alice Smith", new Employee("Alice Smith", 45000, 2));
        employees.put("Bob Johnson", new Employee("Bob Johnson", 55000, 3));
        employees.put("Charlie Brown", new Employee("Charlie Brown", 62000, 1));
        employees.put("Diana White", new Employee("Diana White", 48000, 4));
        employees.put("Edward Davis", new Employee("Edward Davis", 53000, 2));
        employees.put("Fiona Green", new Employee("Fiona Green", 47000, 3));
        employees.put("George Harris", new Employee("George Harris", 60000, 1));
        employees.put("Hannah Clark", new Employee("Hannah Clark", 52000, 4));
        employees.put("Ivan Moore", new Employee("Ivan Moore", 49000, 3));
        employees.put("Julia Scott", new Employee("Julia Scott", 45000, 2));
        employees.put("Kevin Adams", new Employee("Kevin Adams", 58000, 1));
    }


    public Collection<Employee> getEmployees() {
        return employees.values();
    }

    public void printNames() {
        for (Employee emp : getEmployees()) {
            System.out.println(emp.getFullName());
        }
    }

    public void deleteEmployee(String fullName) {
        employees.remove(fullName);
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getFullName(), employee);
    }

    public Employee getEmployee(String fullName) {
        if (employees.containsKey(fullName)) {
            return employees.get(fullName);
        }
        return null;
    }
}