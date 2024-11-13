package com.employee.EmpDB.Service;

import com.employee.EmpDB.Entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {

    List<EmployeeEntity> getAllEmployees();

    EmployeeEntity getEmployeeById(String employeeId);

    EmployeeEntity createEmployee(EmployeeEntity employee);

    EmployeeEntity updateEmployee(String employeeId, EmployeeEntity employeeDetails);

    void deleteEmployee(String employeeId);
}
