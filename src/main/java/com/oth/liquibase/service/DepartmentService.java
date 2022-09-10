package com.oth.liquibase.service;

import com.oth.liquibase.entities.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> findAllDepartments();

}
