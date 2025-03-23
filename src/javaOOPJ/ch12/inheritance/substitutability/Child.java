package javaOOPJ.ch12.inheritance.substitutability;

 
public class Child extends Parent {
//	protected int i = 5;	// Hiding b of Parent
//	protected boolean b = true;	// Hiding b of Parent
//	protected static String s = "Child"; // Hiding b of Parent
	
	private int i = 5;	// Hiding b of Parent
	private boolean b = true;	// Hiding b of Parent
	private static String s = "Child";
	
	public static void f(){
		System.out.println("f() in Child");
	}
	
	public void g() {
		System.out.println("g() in Child");
	}
}
