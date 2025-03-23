
package javaOOPJ.ch10.packaging.staticImport;

//import static java.lang.Math.pow;
//import static java.lang.Math.PI;

import static java.lang.Math.*;

import static javaOOPJ.ch10.packaging.staticImport.AClass.*;


 
public class StaticImport {

	public static void main(String[] args) {
		System.out.println(A_CONSTANT);
		System.out.println(aStaticVariable);
		aStaticMethod();
		
		System.out.println();
		
		System.out.println(Math.PI + " " + PI);
		System.out.println(Math.pow(2, 10) + " " + pow(2,10));
		
		System.out.println(PI + " " + PI);
		System.out.println(pow(2, 10) + " " + pow(2,10));
	}
}
