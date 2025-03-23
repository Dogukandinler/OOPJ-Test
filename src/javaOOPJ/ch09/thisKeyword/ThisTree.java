package javaOOPJ.ch09.thisKeyword;

 
public class ThisTree {
	String type;
	float height;

	public ThisTree(String type, float height) {
		this.type = type;
		this.height = height;
	}
	
	public void printInfo() {
		System.out.println("\nTree Info:");
		this.printType(); // No need to use this here!
		this.printHeight(); // No need to use this here!
	}
	
//	No need to use "this" here
	public void printType() {
		System.out.println("Type: " + this.type);
	}

//	No need to use "this" here
	public void printHeight() {
		System.out.println("Height: " + this.height);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
		ThisTree tree = new ThisTree("Cinar", 12.0f);
		tree.printInfo();
	}
}
