package javaOOPJ.ch12.inheritance.overriding;

 
public class RestrictiveOverrding {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.f();
		System.out.println(p.i);

		Child c = new Child();
		c.f();
//		System.out.println(c.i);
	}
}

class Parent {
	public int i = 8;

	public void f() {
	}
}

class Child extends Parent {
	private int i = 9;

	public void f() {
	}
}
