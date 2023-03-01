package com.prowings.design_pattern_builder;

public class TestStudentBuilder {
	public static void main(String[] args) {

		Student st = new Student.StudentBuilder("vaibhav", "vyavhare").address("pune").mobileNumber(785615615).build();
		System.out.println(st);

		Student st1 = new Student.StudentBuilder("akshay", "vyavhare").address("mumbai").mobileNumber(745858255)
				.roll(101).build();
		System.out.println(st1);

	}

}
