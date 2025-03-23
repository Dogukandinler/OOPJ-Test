package javaOOPJ.ch09.init.constructor.noArg;

 
public class Tree {
	String type;
	float height;
	
	public Tree(){
		type = "Pine";
		height = 1.0f;
	}
	
	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public static void main(String[] args) {
		Tree tree1 = new Tree();
		tree1.printInfo(); // Meaningful state!
		
		Tree tree2 = new Tree();
		tree2.printInfo(); 
		
		tree1.type = "Oak";
		tree1.height = 8.74f;
		tree1.printInfo();
	}
}
