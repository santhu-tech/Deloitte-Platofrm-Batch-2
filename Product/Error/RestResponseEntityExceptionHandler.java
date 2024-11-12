package com.SpringBoot.Ecommerce.Product.Error;

import com.SpringBoot.Ecommerce.Product.Model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice //globally handle the exceptions
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage employeeNotFoundHandler(EmployeeNotFoundException exception){
            ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
            return  message;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage genericExceptionHandler(Exception exception){
        ErrorMessage message=new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        return  message;
    }



}
