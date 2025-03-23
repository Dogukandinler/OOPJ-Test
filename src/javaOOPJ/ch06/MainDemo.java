package javaOOPJ.ch06;

 
public class MainDemo {

	public static void main(String[] args) {

		if (args.length == 3) {
			String name = args[0];
			String lastName = args[1];
			String age = args[2];
			System.out.println(name + " " + lastName + " " + age);
		} else {
			System.out.println("Please provide three arguments!");
			System.exit(1);
		}

		int lenth = args.length;
		System.out.println(lenth + " tane arguman gectin.");

		for (String s : args)
			System.out.println(s);
		
		int intAge = Integer.parseInt(args[2]);
		System.out.println(intAge * 2);

//		int sum = 0;
//
//		for (String s : args) {
//			int integer = Integer.parseInt(s);
//			sum += integer;
//		}
//
//		System.out.println("Sum: " + sum);
	}
}
