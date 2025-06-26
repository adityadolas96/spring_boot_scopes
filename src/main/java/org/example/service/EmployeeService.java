package org.example.service;

import org.example.Entity.Employees;
import org.example.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    public EmployeeRepository employeeRepository;

    public EmployeeService (EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    public String getEmployeeDate(){
        Optional<Employees> employee = employeeRepository.findById(1L);
        return employee.get().getFirstName();
    }
}
