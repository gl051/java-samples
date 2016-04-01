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
            // Example 1: of polymorphism using interface
            Circle circle = new Circle();
            Square square = new Square();
            DrawShape(circle);
            DrawShape(square);

            // Example 2: of polymorphis using abstrac class
            Student student = new Student("Allison", "Smith");
            Teacher teacher = new Teacher("Mark", "Jefferson");
            PrintJob(student);
            PrintJob(teacher);

            // Example 3: the List interface provided by Java util package
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
    
    // Programming against an Interface, argument is Shape
    private static void DrawShape(IShape shape) throws Exception{
        shape.Draw();
        Thread.sleep(2000);
    }

    // Programming against an abstract class, argument is Person
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
