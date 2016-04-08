package com.gl051.params;

import java.util.Optional;

public class Foolish {
	
	// Reference:
	// http://stackoverflow.com/questions/965690/java-optional-parameters
	
	// First way is using method overloading
	public void fooWithMethodOverloading(int par1, int par2)
	{
		System.out.println(String.format("I am fooWithMethodOverloading: par1 = %d, par2 = %d", par1, par2));
	}
	
	public void fooWithMethodOverloading(int par1){
		int defaultVal = -1;
		fooWithMethodOverloading(par1, defaultVal);
	}
	
	// Second way is using varargs
	@SuppressWarnings("unused")
	public void fooWithVarArgs(int par1, int ... par2){
		int defaultVal = -1;
		
		// Assuming type of optional parameters are all the same
		int pA = par2.length > 0 ? par2[0] : defaultVal;
		int pB = par2.length > 1 ? par2[1] : defaultVal;
		
		System.out.println(String.format("I am fooWithVarArgs: par1 = %d, par2 = %d", par1, pA));			
	}
	
	// Using the java.util.Optional class
	public void fooWithOptionalClass(int par1, Optional<Integer> par2){
		int defaultVal = -1;
		int pA = par2.isPresent() ? par2.get() : defaultVal;
		System.out.println(String.format("I am fooWithOptionalClass: par1 = %d, par2 = %d", par1, pA));			
	}
	
	// Using the Builder Pattern
	// You implement a builder class which wraps the build of the class Foo and provide some set methods
	// to specify values different from defualt ones. I personally found this approach a little bit 
	// overwhelming.
	

}
