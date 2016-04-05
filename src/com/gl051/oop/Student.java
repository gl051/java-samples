package com.gl051.oop;

// Student is a child class, extends the base class (which in this case is an abstract class)
public class Student extends Person {

    public Student(String firstname, String lastname)
    {
        // Call the base class
    	super(firstname, lastname);
    }
    
    // Override the abstrac method, it is require to extend the abstrac class
    @Override
    public String getOccupation() {
        return "Student";
    }
    
    // Override the parent method
    @Override
    public void printHello(){
    	System.out.println("Hello from a Student class instance");
    }
    
    

}
