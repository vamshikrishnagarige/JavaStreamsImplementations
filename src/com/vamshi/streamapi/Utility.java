package com.vamshi.streamapi;

import com.vamshi.streamapi.entity.Employee;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 06-12-2025
 */
public class Utility {
    public static List<Employee> getListOfEmployees(){
        return Arrays.asList(
                new Employee(1, "Vamshi", 75000, "IT"),
                new Employee(2, "Krishna", 60000, "HR"),
                new Employee(3, "Garige", 80000, "Finance"),
                new Employee(4, "John", 55000, "IT"),
                new Employee(5, "Doe", 70000, "Marketing")
        );
    }
}
