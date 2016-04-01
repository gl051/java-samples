package com.gl051.oop;

public abstract class Person {
    
    private String _firstName;
    private String _lastName;
    
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
    
    public abstract String getOccupation();
}
