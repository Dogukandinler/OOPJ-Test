package javaOOPJ.ch12.factories.factory2;

 
public class Manager extends Employee {
	protected String departmentManaged;

	public static final int MANAGEMENT_PAYMENT = 3000;

	public Manager(int no, String name, int year, String workingDepartment, String departmentManaged) {
		super(no, name, year, workingDepartment);
		this.departmentManaged = departmentManaged;
	}

	public void manage() {
		System.out.println("Manager manages department: " + departmentManaged);
	}
}
