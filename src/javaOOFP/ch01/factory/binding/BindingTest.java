package javaOOFP.ch01.factory.binding;

import javaOOFP.ch01.factory.Boss;
import javaOOFP.ch01.factory.Employee;
import javaOOFP.ch01.factory.HR;

public class BindingTest {

	public static void main(String[] args) {
		HR hr = new HR();
		
		Employee e = hr.getAnEmployee();
		e.work();

		Boss boss = new Boss();
		boss.youWorkToo();
	}
}
