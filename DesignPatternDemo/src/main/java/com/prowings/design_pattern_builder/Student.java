package com.prowings.design_pattern_builder;

public class Student {

	String firstName;
	String lastName;
	int roll;
	String address;
	Long mobileNumber;
	int marks;

	public Student(StudentBuilder studentBuilder) {
		super();
		this.firstName =studentBuilder.firstName;
		this.lastName = studentBuilder.lastName;
		this.roll =studentBuilder.roll;
		this.address =studentBuilder.address;
		this.mobileNumber = studentBuilder.mobileNumber;
		this.marks =studentBuilder.marks;
	}

	public static class StudentBuilder {

		String firstName;
		String lastName;
		int roll;
		String address;
		long mobileNumber;
		int marks;

		public StudentBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public StudentBuilder roll(int roll) {
			this.roll=roll;
			return this ;
			
		}
		public StudentBuilder address(String address) {
			this.address=address;
			return this ;
			
		}
		public StudentBuilder mobileNumber(long mobileNumber) {
			this.mobileNumber=mobileNumber;
			return this ;
			
		}
		public StudentBuilder marks(int marks) {
			this.marks=marks;
			return this ;
			
		}
		public Student build() {
			Student st=new Student(this);
			return st;
		}

	}
	@Override
	public String toString() {
		return "StudentBuilder [firstName=" + firstName + ", lastName=" + lastName + ", roll=" + roll + ", address="
				+ address + ", mobileNumber=" + mobileNumber + ", marks=" + marks + "]";
	}


}
