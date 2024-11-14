package com.employee.EmpDB.Error;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message){
        super(message);
    }
}
