package com.employee.EmpDB.Controller;

import com.employee.EmpDB.Entity.EmployeeEntity;
import com.employee.EmpDB.Service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.ContentResultMatchers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest(EmployeeControllerV1.class)  //Controller layer
public class EmployeeControllerTest {
    @Autowired
    private MockMvc mockMvc;   //Controller layer ->commonly used spring Bean for web application--Junit5

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testGetAllEmployees() throws Exception {
        List<EmployeeEntity> employees= Arrays.asList(
                new EmployeeEntity("100","Santhiya","P","santhiya@gmail.com","Engineering"),
                 new EmployeeEntity("101","Kowsic","P","Kowsic@gmail.com","HR")
        );
                when(employeeService.getAllEmployees()).thenReturn(employees);

                mockMvc.perform( get( "/api/employees")
                        .contentType(MediaType.APPLICATION_JSON))
                        .andExpect(status().isOk())
                        .andExpect(jsonPath("$[0].firstName").value("Santhiya"))
                        .andExpect(jsonPath("$[1].firstName").value("Kowsic"));

    }

    @Test
    public void testGetEmployeeById() throws Exception {
        EmployeeEntity employee=new EmployeeEntity("100","Santhiya","P","santhiya@gmail.com","Engineering");

        when(employeeService.getEmployeeById("100")).thenReturn(employee);

        mockMvc.perform( get("/api/employees/100")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.firstName").value("Santhiya"))
                .andExpect(jsonPath("$.lastName").value("P"));
    }


}




