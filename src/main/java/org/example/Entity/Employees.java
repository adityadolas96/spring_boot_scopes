package org.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Employees {
    @Id
    private int employeeId;
    private String firstName;
    private String lastName;
    private int departmentId;
    private Date hireDate;


}
