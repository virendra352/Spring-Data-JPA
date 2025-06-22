package com.Applicant.exceptionHandle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Objects;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> HandleResourceException(ResourceNotFoundException ex, HttpServletRequest request, WebRequest web){
        HashMap<String, Object> map=new HashMap<>();
        map.put("TimeStamp", LocalDateTime.now());
        map.put("Error", "Not found");
        map.put("Status", HttpStatus.NOT_FOUND);
        map.put("Message", ex.getMessage());
        map.put("method", request.getMethod());
        map.put("clientIp", request.getRemoteAddr());
        map.put("Path", web.getDescription(false));

      return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> HandleException(Exception ex, HttpServletRequest request, WebRequest web){
        HashMap<String, Object> map=new HashMap<>();
        map.put("TimeStamp", LocalDateTime.now());
        map.put("Error Exception", "Not found");
        map.put("Status", HttpStatus.NOT_FOUND);
        map.put("Message", ex.getMessage());
        map.put("method", request.getMethod());
        map.put("clientIp", request.getRemoteAddr());
        map.put("Path", web.getDescription(false));

        return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
    }
}
