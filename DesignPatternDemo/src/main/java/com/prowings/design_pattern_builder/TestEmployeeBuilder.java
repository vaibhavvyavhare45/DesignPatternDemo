package com.prowings.design_pattern_builder;

public class TestEmployeeBuilder {
	public static void main(String[] args) {
		
		Employee e=new Employee.EmployeeBuilder().empFirstName("ganesh").empLastName("satpute").empAddress("pune").build();
		
		System.out.println(e);
		Employee emp1 = new Employee.EmployeeBuilder().empFirstName("Ram").build();
		System.out.println(emp1);
	}

}
