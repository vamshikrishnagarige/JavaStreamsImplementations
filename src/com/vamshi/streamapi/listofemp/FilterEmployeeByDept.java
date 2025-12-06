package com.vamshi.streamapi.listofemp;

import com.vamshi.streamapi.Utility;
import com.vamshi.streamapi.entity.Employee;

import java.util.List;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 06-12-2025
 */
public class FilterEmployeeByDept {
    public static void main(String[] args) {
        List<Employee> employees = Utility.getListOfEmployees();

        employees.stream().filter(emp -> emp.getDepartment().equals("IT"))
                .forEach(System.out::println);
    }
}
