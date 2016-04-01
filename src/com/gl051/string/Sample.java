package com.gl051.string;

import com.gl051.ISample;

public class Sample implements ISample {

    @Override
    public void run() {
        SplitAndJoin();
    }

    @Override
    public String getDescription() {
        return "String split and join";
    }
    
    private static void SplitAndJoin(){
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

}
