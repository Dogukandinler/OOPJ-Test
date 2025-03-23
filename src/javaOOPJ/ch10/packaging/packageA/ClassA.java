package javaOOPJ.ch10.packaging.packageA;

import javaOOPJ.ch10.packaging.packageX.ClassX;

 
public class ClassA {

//	ClassX x1; // Error!
	ClassX x;
	
	public ClassA(ClassX x) {
		this.x = x;
	}
}
