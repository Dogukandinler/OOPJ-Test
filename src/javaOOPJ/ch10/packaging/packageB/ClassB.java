package javaOOPJ.ch10.packaging.packageB;

import javaOOPJ.ch10.packaging.packageX.ClassX;
import javaOOPJ.ch10.packaging.packageX.ClassZ;

// or


public class ClassB {
	ClassX x;
	ClassZ z;
	
	public ClassB(ClassX x) {
		this.x = x;
	}

	public ClassB(ClassX x, ClassZ z) {
		super();
		this.x = x;
		this.z = z;
	}
}

class ClassC {
	ClassX x;
	ClassZ z;
}

class ClassD {
	ClassX x;
	ClassZ z;
}
