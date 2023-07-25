package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    @Size(min = 2 , message = "Employee Name Shold be greater than 2 char")
    private String empName;

    private String empAddress;

    private long empContactNumber;

    private double empSalary;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

    private String empEmailId;

    private String empPassword;
}
