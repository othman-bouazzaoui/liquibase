package com.oth.liquibase.service;

import com.oth.liquibase.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployees();
}
