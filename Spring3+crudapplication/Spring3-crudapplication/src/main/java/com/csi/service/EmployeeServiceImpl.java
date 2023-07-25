package com.csi.service;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {
    @Autowired
    EmployeeRepo employeeRepo;

    public Employee saveData(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Boolean signIn(String empEmailId, String empPassword) {
        boolean flag = false;
        for (Employee employee : getAllData()) {
            if (employee.getEmpEmailId().equals(empEmailId) && employee.getEmpPassword().equals(empPassword)) {
                flag = true;
            }
        }
        return flag;
    }

    public List<Employee> getAllData() {
        return employeeRepo.findAll();
    }
    public Employee updateData(Employee employee){
        return  employeeRepo.save(employee);
    }
    public Employee partialUpdateData(Employee employee){
       return employeeRepo.save(employee);
    }
    public Optional<Employee> getDataById(int empId){
        return employeeRepo.findById(empId);
    }

}
