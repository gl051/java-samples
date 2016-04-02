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
    	String choice = "CONTROLFLOW";
    	
    	switch (choice)
    	{
    		case "OOP":
    			return new com.gl051.oop.Sample();
    		case "STRING":
    			return new com.gl051.string.Sample();
    		case "DATEFORMAT":
    			return new com.gl051.dateformat.Sample();
    		case "ENUMERATE":
    			return new com.gl051.enumerate.Sample();
    		case "GENERIC":
    			return new com.gl051.generic.Sample();
    		case "JDBC":
    			return new com.gl051.jdbc.Sample();
    		case "CONTROLFLOW":
    			return new com.gl051.controlflow.Sample();
    		default:
    			return null;
    	}        
    }

}
