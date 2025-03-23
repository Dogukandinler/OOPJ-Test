package javaOOPJ.ch08.calculator;

 
public class DirtyCalculator{

	void whoAreYou() {
		System.out.println("Pi is " + Math.PI);
	}

	int f(int a, int b) {
		return a + b;
	}

	int doSubtraction(int first, int second) {
		return first - second;
	}

	int mltply(int first, int second) {
		return first * second;
	}

	int multiplybyadding(int first, int second) {
		int multiplication = 0;
		for (int i = 1; i <= second; i++)
			multiplication += first;
		System.out.println("Multiplication: " + multiplication);
		return multiplication;
	}

	double dvd(int first, int second) {
		return (double) first / second;
	}
	
	double getDollarEuroParity(){
		return 1.1;
	}
}
