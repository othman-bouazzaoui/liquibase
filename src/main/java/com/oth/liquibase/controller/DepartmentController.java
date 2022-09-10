package com.oth.liquibase.controller;

import com.oth.liquibase.entities.Department;
import com.oth.liquibase.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("departments")
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("all")
    public ResponseEntity<List<Department>> allDepartments(){
        return ResponseEntity.ok(departmentService.findAllDepartments());
    }

}
