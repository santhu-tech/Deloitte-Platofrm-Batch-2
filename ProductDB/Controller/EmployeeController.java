//package com.SpringBoot.Ecommerce.ProductDB.Controller;
//
//import com.SpringBoot.Ecommerce.ProductDB.Model.Employee;
//import com.SpringBoot.Ecommerce.ProductDB.Service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/v1/api/employees")   //API Versoining
//public class EmployeeController {
//
//    @Qualifier("EmployseeServiceImpl")
//    @Autowired
//    private EmployeeService employeeService;
//
//    //Save the employee details
//
//    @PostMapping("/emp")
//    public Employee save(@RequestBody Employee employee){
//            //write the code to access the service layer
//        return employeeService.save(employee);
//    }
//
//    @GetMapping("/getemp")
//    public List<Employee> getAllEmployees(){
//        return employeeService.getAllEmployees();
//    }
//
//    @GetMapping("/getemp/{id}")
//    public  Employee getEmployeeById(@PathVariable String id){
//        return employeeService.getEmployeeById(id);
//    }
//
//    @DeleteMapping("/getemp/{id}")
//        public String deleteEmployeeById(@PathVariable String id){
//            return employeeService.deleteEmployeeById(id);
//        }
//}

