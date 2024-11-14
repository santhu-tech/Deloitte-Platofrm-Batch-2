package com.employee.EmpDB.Service;

import com.employee.EmpDB.Entity.EmployeeEntity;
import com.employee.EmpDB.Repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class EmployeeServiceImplTest {
    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;
    private EmployeeEntity employee;
    @BeforeAll

    @BeforeEach
    void setup(){

        MockitoAnnotations.openMocks(this);
        employee =new EmployeeEntity("1","santhiya","p","santhiya@gmail.com","IT");
//        //employee.setId("1");
//        employee.setEmployeeId("1");
//        employee.setFirstName("santhiya");
//        employee.setLastName("p");
//        employee.setEmailId("santhiya@gmail.com");
//        employee.setDepartment("IT");

    }
    @Test
    void testGetAllEmployee(){

        when(employeeRepository.findAll()).thenReturn(Arrays.asList(employee));

        List<EmployeeEntity> employees=employeeService.getAllEmployees();

        //Asserations
        assertNotNull(employees);
        assertEquals("santhiya",employees.get(0).getFirstName());
    }

    @Test


}
