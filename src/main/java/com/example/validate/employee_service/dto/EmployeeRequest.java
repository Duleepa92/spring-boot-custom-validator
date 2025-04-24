package com.example.validate.employee_service.dto;

import com.example.validate.employee_service.annotations.ValidBloodGroup;
import com.example.validate.employee_service.constants.BloodGroups;
import jakarta.validation.constraints.NotNull;

public class EmployeeRequest {
	
	private int id;
	
	@NotNull
	@ValidBloodGroup(enumClass = BloodGroups.class, message = "Invalid blood group")
	private String bloodGroup;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
