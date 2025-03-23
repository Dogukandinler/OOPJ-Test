package javaOOPJ.ch08.overloading;

 
public class PrimitiveOverloading2 {

	public static void main(String[] args) {
		byte b1 = 1;
		byte b2 = 5;
		print(b1, b2);
	}
	
	public static void print(int i, short j){
		System.out.println("print(int i, short j)");
	}
	
	public static void print(short i, int j){
		System.out.println("print(short i, int j)");
	}
	
	//If this method is removed then it is a compilation error due to ambiguity.
	public static void print(short i, short j){
		System.out.println("print(short i, short j)");
	}
}
