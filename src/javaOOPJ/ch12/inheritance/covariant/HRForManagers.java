package javaOOPJ.ch12.inheritance.covariant;

import javaOOPJ.ch12.factories.factory3.Manager;

 
public class HRForManagers extends HR{
	
	public Manager getAnEmployee(){  // Covariant return type
		return new Manager(2, "Fatma", 3, "Production", "Production");
	}
}
