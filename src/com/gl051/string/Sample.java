package com.gl051.string;

import com.gl051.ISample;
import java.time.LocalTime;

public class Sample implements ISample {

    @Override
    public void run() {
        SplitAndJoin();
        Formatting();
    }

    @Override
    public String getDescription() {
        return "String split and join";
    }
    
    private void SplitAndJoin(){
        // Define a string
        String str = "Tom, Jack, Mark, Susan";
        System.out.println("String to start with: " + str);
        
        // Split the string
        String[] names = str.split(",");
        for(String t:names){
            System.out.println("Name = " + t);
        }
        
        String[] cities = {"Barcelona", "Milan", "Tokio", "San Francisco"};
        System.out.println("List of cities: " + String.join(", ", cities));
    }
    
    private void Formatting(){
    	String city = "San Francisco";
    	Integer rate = 98;
    	
    	String msg = String.format("%s - City: %s, Rate: %d", LocalTime.now().toString(), city, rate );
    	System.out.println(msg);
    }

}
