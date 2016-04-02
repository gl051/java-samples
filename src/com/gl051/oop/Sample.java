package com.gl051.oop;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import com.gl051.ISample;

public class Sample implements ISample {

    @Override
    public String getDescription() {
        return "OOP pillars: Encapsulation, Inheritance, Polymorphism";
    }

    @Override
    public void run() {
        try {
            // Example 1: polymorphism using interface
        	// Circle implements the interface (contract)
        	// Square implements the interface (contract)
            DrawShape(new Circle());
            DrawShape(new Square());

            // Example 2: polymorphism using abstract class
            // Student IS a Person (inheritance)
            // Teacher IS a Persone (inheritance)
            PrintJob(new Student("Allison", "Smith"));
            PrintJob(new Teacher("Mark", "Jefferson"));

            // Example 3: polymorphism using built-in data types
            ArrayList<String> arrlist = new ArrayList<>();
            LinkedList<String> lnklist = new LinkedList<>();
            PopulateList(arrlist);
            PopulateList(lnklist);
            PrintList(arrlist);
            PrintList(lnklist);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Programming against an Interface
    // Each class that implements the interface will run its own
    // implementation at run time
    private static void DrawShape(IShape shape) throws Exception{
    	shape.Draw();
        Thread.sleep(2000);
    }

    // Programming against an abstract class
    // Encapsulation expressed by the getter methods
    private static void PrintJob(Person p){        
    	System.out.println("Person name: " + p.getFullName());
        System.out.println("Job: " + p.getOccupation());
    }

    // Practical example of programming against an interface.
    // These two methods do not rely on what implementation of List you are using,
    // the developer will pick the one more appropriate and this code still works.
    private static void PopulateList(List<String> inputList){
        inputList.clear();
        inputList.add("Bologna");
        inputList.add("Milan");
        inputList.add("Rome");
    }

    private static void PrintList(List<String> inputList){
        for(String t : inputList)
            System.out.println(t);
    }
    
    

}
