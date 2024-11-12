//package com.SpringBoot.Ecommerce.ProductDB.Service;
//
//import com.SpringBoot.Ecommerce.ProductDB.Model.Employee;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService{
//
//
//    List<Employee> employees =new ArrayList<>();
//    @Override
//    public Employee save(Employee employee) {
//        //write your own business logic
//        if(employee.getEmployeeId()==null ||
//                employee.getEmailId().isEmpty()){
//            employee.setEmployeeId((UUID.randomUUID().toString()));
//        }
//        employees.add(employee);
//        return employee;
//    }
//    @Override
//    public List<Employee> getAllEmployees() {
//        return employees;
//    }
//    @Override
//    public Employee getEmployeeById(String id) {
//        return employees
//                .stream()
//                .filter(employee -> employee.getEmployeeId().equalsIgnoreCase(id))  //intermediate operation
//                .findFirst()  //Terminal operation
//                .orElseThrow(()->new RuntimeException("Employee Not found with id: " +id)); //collecting
//    }
//
//    @Override
//    public String deleteEmployeeById(String id) {
//        Employee employee
//                =employees.stream()
//                .filter(e ->e.getEmployeeId().equalsIgnoreCase(id))
//                .findFirst()
//                .get();
//        employees.remove(employee);
//        return "Employee deleted with thr id: " + id;
//    }
//
//
//}
