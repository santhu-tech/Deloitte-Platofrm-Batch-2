package com.employee.EmpDB.Repository;

import com.employee.EmpDB.Entity.EmployeeEntity;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Transactional
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    private EmployeeEntity employee;

    @BeforeEach
    void setUp(){
        employee=new EmployeeEntity("1","santhiya","p","santhiya@gmil.com","IT");

        employeeRepository.save(employee);
    }
    @Test
    void testFindById_Found(){
        // Attempt to find the employee by ID
        Optional<EmployeeEntity> foundEmployee = employeeRepository.findById("1");

        // Assertions
        assertTrue(foundEmployee.isPresent());
        assertEquals("santhiya", foundEmployee.get().getFirstName());

    }
    @Test
    void testFindById_NotFound() {
        // Attempt to find an employee with a non-existing ID
        Optional<EmployeeEntity> foundEmployee = employeeRepository.findById("2");

        // Assertions
        assertFalse(foundEmployee.isPresent());
    }

    @Test
    void testSaveEmployee() {
        // Create a new employee and save
        EmployeeEntity newEmployee = new EmployeeEntity("2","Kowsic","M","kowsic@gmail.com","Marketing");


        EmployeeEntity savedEmployee = employeeRepository.save(newEmployee);

        // Assertions
        assertNotNull(savedEmployee);
        assertEquals("Kowsic", savedEmployee.getFirstName());
    }

    @Test
    void testDeleteEmployee() {
        // Delete the existing employee by ID
        employeeRepository.deleteById("1");

        // Verify deletion
        Optional<EmployeeEntity> deletedEmployee = employeeRepository.findById("1");
        assertFalse(deletedEmployee.isPresent());
    }

    @Test
    void testUpdateEmployee() {
        // Update the employee's department and save
        employee.setDepartment("Marketing");
        EmployeeEntity updatedEmployee = employeeRepository.save(employee);

        // Assertions
        assertEquals("Marketing", updatedEmployee.getDepartment());
    }

}
