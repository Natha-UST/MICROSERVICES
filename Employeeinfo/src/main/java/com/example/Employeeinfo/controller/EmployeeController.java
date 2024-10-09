package com.example.Employeeinfo.controller;

import com.example.Employeeinfo.client.FullReponse;
import com.example.Employeeinfo.model.Employee;
import com.example.Employeeinfo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ustemps")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/add")

    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/withprojects/{ccode}")
    public FullReponse getEmployeeByCcode(@PathVariable Long ccode){
       return employeeService.getEmployeeByCcode(ccode);
    }


}
