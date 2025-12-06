package com.vamshi.streamapi.entity;

import java.util.Objects;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 06-12-2025
 */
public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee emp = (Employee) obj;

        return Objects.equals(id, emp.id) &&
                name.equals(emp.name) &&
                Objects.equals(salary, emp.salary) &&
                department.equals(emp.department);
    }

    @Override
    public String toString() {
        return id +" - " + name +  " - " + salary +" - " + department;
    }
}
