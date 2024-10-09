package com.example.Employeeinfo.repository;

import com.example.Employeeinfo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepository  extends JpaRepository<Employee,Long> {
    Employee findByCcode(Long ccode);
}
