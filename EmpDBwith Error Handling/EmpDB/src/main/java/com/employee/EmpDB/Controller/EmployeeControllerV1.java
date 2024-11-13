package com.employee.EmpDB.Controller;

import com.employee.EmpDB.Entity.EmployeeEntity;
import com.employee.EmpDB.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/employees")
public class EmployeeControllerV1 {

//    @Autowired
  //  private EmployeeService employeeService;

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeControllerV1(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable("id") String employeeId) {
        return employeeService.getEmployeeById(employeeId);
        //return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")  //Update
    public EmployeeEntity updateEmployee(@PathVariable("id") String employeeId, @RequestBody EmployeeEntity employee) {
        return employeeService.updateEmployee(employeeId, employee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") String employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.noContent().build();
    }
}
