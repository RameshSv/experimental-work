package com.sb.app.userprofile.advice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.sb.app.userprofile.dto.ErrorResponseDTO;

@RestControllerAdvice
public class UserControllerAdvice {

	@ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponseDTO> handleAllExceptions(Exception ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        ErrorResponseDTO error = new ErrorResponseDTO();
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if(ex.getClass().getSimpleName().equals("RecordNotFoundException")) {
        	details.add(ex.getLocalizedMessage());
        	error.setMessage("Record Not Found");
            error.setDetails(details);
            status = HttpStatus.NOT_FOUND;
        }else if(ex.getClass().getSimpleName().equals("UnModificationException")) {
        	details.add(ex.getLocalizedMessage());
        	error.setMessage("Deleted Unsuccessfully");
            error.setDetails(details);
            status = HttpStatus.NOT_ACCEPTABLE;
        }
        else {
        	details.add(ex.getLocalizedMessage());
        	error.setMessage("Appliction Error");
            error.setDetails(details);
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        
        return new ResponseEntity<ErrorResponseDTO>(error, status);
    }
 
  
}
