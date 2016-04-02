package com.gl051;

public class JavaSamples {

    public static void main(String[] args) {
        System.out.println("*** Tour De Java ***");
        ISample s = getSample();
        if (s != null)
        {
        	System.out.println("Sample description: " + s.getDescription());
        	s.run();
        }
        else
        {        	
        	System.out.println("Can't find the sample to run");
        }
    }
    
    // Get the Sample to execute 
    private static ISample getSample(){
    	// Manually choose what you want to run
    	String choice = "OOP";
    	
    	switch (choice)
    	{
    		case "OOP":
    			return new com.gl051.oop.Sample();
    		case "STRING":
    			return new com.gl051.string.Sample();
    		default:
    			return null;
    	}
        
    }

}
