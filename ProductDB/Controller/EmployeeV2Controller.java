package com.SpringBoot.Ecommerce.ProductDB.Controller;

import com.SpringBoot.Ecommerce.ProductDB.Model.Employee;
import com.SpringBoot.Ecommerce.ProductDB.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/employees")
public class EmployeeV2Controller {
   // @Qualifier("EmployeeV2ServiceImpl")
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/emp")
    public Employee save(@RequestBody Employee employee){
        //write the code to access the service layer
        return employee;
    }
}
