package com.gl051.oop;

public class Student extends Person {

    public Student(String firstname, String lastname)
    {
        super(firstname, lastname);
    }
    
    @Override
    public String getOccupation() {
        return "Student";
    }

}
