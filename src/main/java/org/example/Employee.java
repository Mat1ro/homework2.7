package org.example;

import java.util.Objects;

public class Employee {
    private final String fullName;
    private final float salary;
    private final int department;


    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Float.compare(salary, employee.salary) == 0 && department == employee.department && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary, department);
    }
}
