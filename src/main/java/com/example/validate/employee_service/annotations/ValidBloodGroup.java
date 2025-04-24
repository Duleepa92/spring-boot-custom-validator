package com.example.validate.employee_service.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.validate.employee_service.validator.impl.BloodroupsValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = BloodroupsValidator.class)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidBloodGroup {
 
 Class<? extends Enum<?>> enumClass();
    
    String message() default "Invalid value. Must be one of {enumClass}";
    
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};

}
