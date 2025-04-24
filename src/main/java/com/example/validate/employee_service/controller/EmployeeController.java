package com.example.validate.employee_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.validate.employee_service.dto.EmployeeRequest;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api")
public class EmployeeController {
 
 @PostMapping("/employees")
 ResponseEntity<String> saveEmployeeDetails(@Valid @RequestBody EmployeeRequest req) {
  return ResponseEntity.status(HttpStatus.OK).body("Employee ID: "+ req.getId()+ "blood group: " + req.getBloodGroup());
 }
}
