package com.springdatabase.EcomDB.Category.Error;

import com.springdatabase.EcomDB.Category.Model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<ErrorMessage> categoryNotFoundException(CategoryNotFoundException exception , WebRequest request){

        ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);

    }


}
