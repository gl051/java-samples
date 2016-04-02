package com.gl051.enumerate;

import com.gl051.ISample;

public class Sample implements ISample {

	private enum WEEKDAYS {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
    private enum ENERGY_LEVELS {
        LOW(100),
        MEDIUM(200),
        HIGH(300);
        
        private final int value;
        
        ENERGY_LEVELS(int mass) {
            this.value = mass;
        }
        
        // You can add a method if you need the representation of the enum
        private int getValue() { 
            return value; 
        }        
    }
    
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// Using enum type
        System.out.println("I love when is " + WEEKDAYS.FRIDAY);                
        System.out.println("Energy level is " + ENERGY_LEVELS.LOW);
        System.out.println("Energy level is " + ENERGY_LEVELS.LOW.getValue());
        
        
        // The enum declaration defines a class (called an enum type). 
        // The enum class body can include methods and other fields. 
        // The compiler automatically adds some special methods when it creates an enum. 
        // For example, they have a static values method that returns an array containing 
        // all of the values of the enum in the order they are declared.        
        for(WEEKDAYS d : WEEKDAYS.values()){
            System.out.println(d);
        }
        
        
        // Enum has there own name-space. It means your enum will have a type for example “ENERGY_LEVEL” 
        // and you can not assign any value other than specified in Enum Constants. Type safe.
        // ENERGY_LEVELS myEnergyLevel = 100;  <--- Error from the compiler
        ENERGY_LEVELS myEnergyLevel = ENERGY_LEVELS.LOW; 
        // Being type safe you can safely compare them with ==
        if (myEnergyLevel == ENERGY_LEVELS.LOW)
            System.out.println("My energy level is slow, I better go to sleep!");

	}

}
