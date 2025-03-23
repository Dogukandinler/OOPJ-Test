package javaOOPJ.ch12.inheritance.hiding;

 
public class HidingExample {

	public static void main(String[] args) {
//		Parent p = new Parent(10, true);
//		System.out.println("p.i: " + p.i);
//		Parent.g();
//		p.printInfo();
//		
//		System.out.println();

		Child c = new Child(20, false, 30, (byte) 120, 40);
		System.out.println("c.i: " + c.i);
//		System.out.println(c.super.i); // Can't say this!
		c.printInfo();	// Inherited method
		
		c.printInfoUsingSuper();
	}
}
