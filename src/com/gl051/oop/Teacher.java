package com.gl051.oop;

public class Teacher extends Person {

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getOccupation() {
        return "Teacher";
    }
    
    

}
