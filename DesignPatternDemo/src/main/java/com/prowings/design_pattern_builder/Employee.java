package com.prowings.design_pattern_builder;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

@Builder
@ToString
public class Employee {
	@NonNull
	String empFirstName;
	String empLastName;
	int empId;
	String empAddress;
	int pin;
	long empMobileNumber;
	

}
