package javaOOPJ.ch09.init.constructor.overloaded;

import java.util.Date;

 
public class Employee {

	int id;
	String firstName;
	String lastName;
	Date birthDate;
	float salary;
	String department = "No department yet!";

	public Employee(int newId, String newFirstName, String newLastName, Date newBirthDate, float newSalary) {
		id = newId;
		firstName = newFirstName;
		lastName = newLastName;
		birthDate = newBirthDate;
		salary = newSalary;
	}

	public Employee(int newId, String newFirstName, String newLastName, Date newBirthDate, float newSalary,
			String newDepartment) {
//		id = newId;
//		firstName = newFirstName;
//		lastName = newLastName;
//		birthDate = newBirthDate;
//		salary = newSalary;
		this(newId, newFirstName, newLastName, newBirthDate, newSalary);
//		department = newDepartment;
	}
}