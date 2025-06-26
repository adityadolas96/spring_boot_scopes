package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public String getEmployeeDate(){
        return "Employee Data from Service Layer!";
    }
}
