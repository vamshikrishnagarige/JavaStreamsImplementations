package com.vamshi.streamapi.listofemp;

import com.vamshi.streamapi.entity.Employee;

import java.util.List;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 06-12-2025
 */
public class FilterEmployeeByDept {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Vamshi Krishna", 50000, "IT"),
                new Employee(2, "Pranay", 60000, "HR"),
                new Employee(3, "Maikel", 55000, "IT"),
                new Employee(4, "Luffy", 70000, "Finance"),
                new Employee(5, "Zoro", 65000, "HR")
        );

        employees.stream().filter(emp -> emp.getDepartment().equals("IT"))
                .forEach(System.out::println);
    }
}
