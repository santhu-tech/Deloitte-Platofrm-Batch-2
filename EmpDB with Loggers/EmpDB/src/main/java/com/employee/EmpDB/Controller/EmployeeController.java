/*package com.employee.EmpDB.Controller;

import com.employee.EmpDB.Entity.EmployeeEntity;
import com.employee.EmpDB.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired

    private EmployeeService employeeService;

   /* private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Get all employees
    @GetMapping
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    // Get employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable("id") String employeeId) {
        Optional<EmployeeEntity> employee = employeeService.getEmployeeById(employeeId);
        return employee.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Create new employee
    @PostMapping
    public ResponseEntity<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity employee) {
        return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    // Update employee by ID
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeEntity> updateEmployee(
            @PathVariable("id") String employeeId,
            @RequestBody EmployeeEntity employeeDetails) {
        return new ResponseEntity<>(employeeService.updateEmployee(employeeId, employeeDetails), HttpStatus.OK);
    }

    // Delete employee by ID

 /*   public ResponseEntity<EmployeeEntity> deleteEmployee(@PathVariable("id") String employeeId) {
        EmployeeEntity deletedEmployee = employeeService.getEmployeeById(employeeId); // Retrieve before deletion
        employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>(deletedEmployee, HttpStatus.OK);
    }
   @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") String employeeId) {
        employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
} */
