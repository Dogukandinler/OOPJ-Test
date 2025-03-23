package javaOOPJ.ch12.inheritance.access.protect;

 
public class AccessTest {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("Child Info");
		System.out.println("child.x: " + child.x); // x is public
//		System.out.println("child.y: " + child.y); // y is default
//		System.out.println("child.t: " + child.t); // t is protected and it is not accessible if Child inherits from Parent2
//		System.out.println("z: " + z); // z is private
	}
}
