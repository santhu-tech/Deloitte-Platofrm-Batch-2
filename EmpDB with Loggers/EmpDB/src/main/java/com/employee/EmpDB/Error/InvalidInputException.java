package com.employee.EmpDB.Error;

public class InvalidInputException extends RuntimeException{
    public InvalidInputException(String message){
        super(message);
    }
}
