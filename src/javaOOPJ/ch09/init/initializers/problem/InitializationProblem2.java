package javaOOPJ.ch09.init.initializers.problem;

import java.time.LocalTime;

  
public class InitializationProblem2 {
	String name;
	int i;

	double coefficient;

	InitializationProblem2() {
//		this("default"); // Can't call it!

		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.NOON))
			coefficient = 2;
		else
			coefficient = 4;
	}

	InitializationProblem2(String name, int i) {
		this.name = name;
		this.i = i;

		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.NOON))
			coefficient = 2;
		else
			coefficient = 4;
	}
}
