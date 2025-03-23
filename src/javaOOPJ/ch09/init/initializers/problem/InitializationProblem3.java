package javaOOPJ.ch09.init.initializers.problem;

import java.time.LocalTime;


public class InitializationProblem3 {
	String name;

	double coefficient;

	InitializationProblem3() {
		name = "default";
		initializeCoefficient();
	}

	InitializationProblem3(String name) {
		this.name = name;
		initializeCoefficient();
	}
	
	void initializeCoefficient() {
		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.NOON))
			coefficient = 2;
		else
			coefficient = 4;
	}
}
