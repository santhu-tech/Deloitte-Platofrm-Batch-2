package com.SpringBoot.Ecommerce.ProductDB.Service;

import com.SpringBoot.Ecommerce.ProductDB.Model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
}
