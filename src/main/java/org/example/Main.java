package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        System.out.println(employeeBook.getEmployees());
        employeeBook.deleteEmployee("Alice Smith");
        employeeBook.employees.put("Kevin Adams", new Employee("Kevin Adams", 58000, 1));
        System.out.println(employeeBook.getEmployees());
        System.out.println(employeeBook.getEmployee("Kevin Adams"));
    }
}