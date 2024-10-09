package com.example.Employeeinfo.service;

import com.example.Employeeinfo.client.FullReponse;
import com.example.Employeeinfo.client.Project;
import com.example.Employeeinfo.fegin.Projectclient;
import com.example.Employeeinfo.model.Employee;
import com.example.Employeeinfo.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private Employeerepository employeeRepository;
    @Autowired
    private Projectclient projectclient;
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
   }

   public FullReponse getEmployeeByCcode(Long ccode) {
        Employee employee = employeeRepository.findByCcode(ccode);
       FullReponse response=new FullReponse();
       List<Project> projects=projectclient.findProjectsByCcode(ccode);

      response.setCcode(employee.getCcode());
      response.setName(employee.getName());
      response.setDepartment(employee.getDepartment());
      response.setDesignation(employee.getDesignation());
      response.setSkills(employee.getSkills());
      response.setState(employee.getState());
      response.setExp(employee.getExp());
      response.setDoj(employee.getDoj());
      response.setCity(employee.getCity());
      response.setEmail(employee.getEmail());
      response.setPhone(employee.getPhone());
      response.setAddress(employee.getAddress());

       return response;
   }
}
