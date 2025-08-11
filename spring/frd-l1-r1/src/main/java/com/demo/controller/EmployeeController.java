package com.demo.controller;

import com.demo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    @GetMapping("/getHtmlContent")
    public String getHtmlContent() {
//        String htmlOutput = "<html><head><title>Welcome</title></head><h1 style=\"color:green\">REST API can also expose HTML data.</body></html>";
//        return htmlOutput;
        return "<html><head><title>Welcome</title></head><h1 style=\"color:green\">REST API can also expose HTML data.</body></html>";
    }

    @GetMapping("/getEmployeesAsList")
    public List<Employee> getEmployeesAsList() {
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(1L, "Alice", "Wonder", "alice.wonder@ascendion.com"));     // 1L is a Long literal
        employeesList.add(new Employee(2L, "Bob", "Mapins", "bob.mapins@ascendion.com"));
        employeesList.add(new Employee(3L, "Charlie", "Chaplin", "charlie.chaplin@ascendion.com"));
        return employeesList;
    }

    @GetMapping("/getEmployeesAsMap")
    public Map<Long, Employee> getEmployeesAsMap() {
        Map<Long, Employee> employeesMap = new HashMap<>();
        employeesMap.put(1L, new Employee(1L, "Alice", "Wonder", "alice.wonder@ascendion.com"));
        employeesMap.put(2L, new Employee(2L, "Bob", "Mapins", "bob.mapins@ascendion.com"));
        employeesMap.put(3L, new Employee(3L, "Charlie", "Chaplin", "charlie.chaplin@ascendion.com"));
        return employeesMap;
    }
}