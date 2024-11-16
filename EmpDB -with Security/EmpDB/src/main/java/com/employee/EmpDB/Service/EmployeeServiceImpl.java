package com.employee.EmpDB.Service;

import com.employee.EmpDB.Entity.EmployeeEntity;
import com.employee.EmpDB.Error.EmployeeNotFoundException;
import com.employee.EmpDB.Error.InvalidInputException;
//import com.employee.EmpDB.Error.RestResponseEntityExceptionHandler;
import com.employee.EmpDB.Repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public List<EmployeeEntity> getAllEmployees() {
        logger.debug("Reterving all employees from Database");
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(String employeeId) {
        return employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Employee not found with id:" +employeeId));
    }

    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    public EmployeeEntity updateEmployee(String employeeId, EmployeeEntity employeeDetails) {
        EmployeeEntity employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + employeeId));

        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmailId(employeeDetails.getEmailId());
        employee.setDepartment(employeeDetails.getDepartment());

        return employeeRepository.save(employee);
    }

    public void deleteEmployee(String employeeId) {
        EmployeeEntity employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new InvalidInputException("Employee not found with id: " + employeeId));

        employeeRepository.delete(employee);
    }
}
