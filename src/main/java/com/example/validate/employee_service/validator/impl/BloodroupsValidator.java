package com.example.validate.employee_service.validator.impl;

import java.util.Arrays;
import com.example.validate.employee_service.annotations.ValidBloodGroup;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class BloodroupsValidator implements ConstraintValidator<ValidBloodGroup, String> {

	private Enum<?>[] enumValues;
	
	public void initialize(ValidBloodGroup constraintAnnotation) {
		enumValues = constraintAnnotation.enumClass().getEnumConstants();
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null) {
			return true;
		}
		
		return Arrays.stream(enumValues)
				.map(Enum::name)
				.anyMatch(enumValues -> enumValues.equalsIgnoreCase(value));
	}

}
