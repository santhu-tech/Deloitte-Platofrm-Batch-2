package com.SpringBoot.Ecommerce.Product.Service;

import com.SpringBoot.Ecommerce.Product.Model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
}
