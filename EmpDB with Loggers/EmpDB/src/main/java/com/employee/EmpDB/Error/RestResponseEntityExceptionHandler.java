/*package com.employee.EmpDB.Error;

import com.employee.EmpDB.Model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice  //Globally needs to handle the Exception
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage employeeNotFoundHandler(EmployeeNotFoundException exception){
        ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return  message;
    }
    @ExceptionHandler(InvalidInputException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessage handleInvalidInputException(InvalidInputException ex) {
        ErrorMessage message=new ErrorMessage(HttpStatus.BAD_REQUEST, ex.getMessage());
        return message;
    }
    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage genericExceptionHandler(Exception exception){
        ErrorMessage message=new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        return  message;
    }
}
*/