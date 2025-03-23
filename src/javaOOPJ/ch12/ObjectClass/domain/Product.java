package javaOOPJ.ch12.ObjectClass.domain;

 
public class Product {
	int no;
	String name;
	double price;

	public Product(int no, String name, double price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object o) {
		Product p1 = (Product)o;
		boolean b = false;
		if (no == p1.no & price == p1.price & name.equals(p1.name))
			b = true;
		return b;
	}
//	
	public int hashCode(){
		return no + (int) price + name.hashCode();
	}
}
