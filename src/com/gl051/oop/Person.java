package com.gl051.oop;

import java.time.LocalTime;

public abstract class Person {
    
    // Access to class members: PRIVATE, (no modifier), PROTECTED, PUBLIC
    
    // Private members are only accessible inside this class
    private String _firstName;
    private String _lastName;
    
    // no modifier gives access at package leverl 
    String dummyStringVal = "dummy";
    
    // Protected member are accesible inside the class and the package
    protected int dummyIntVal = 100;
    
    // Public members are accessible everywhere
    public Person(String firstName, String lastName) {
        _firstName = firstName;
        _lastName = lastName;
    }
    
    // Encapsulation: we hide implementation details of how the full name is built
    // We could read information from in memory, from a database, or from a stream
    // all of this is a implementation detail hidden to the final user of the class
    public String getFullName() {
        return _firstName + " " + _lastName;
    }
    
    // Abstrac class, the implemenation details need to be provided by the child class
    public abstract String getOccupation();
    
    // All instance methods are virtual method, they can be overridden by a child class ..
    public void printHello(){
    	System.out.println("Hello from a Person class instance");
    }
    
    // ... unless they are PRIVATE or you use the FINAL keyword
    public final void printTime(){
    	System.out.println(LocalTime.now().toString());
    }
    
    // method overloading
    public void printHello(int n){
    	for(int i = 0; i < n; i++){
    		System.out.println("Hello from the Person class");
    	}
    }
}
