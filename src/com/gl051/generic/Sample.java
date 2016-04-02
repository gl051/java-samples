package com.gl051.generic;

import com.gl051.ISample;

public class Sample implements ISample {

	@Override
	public String getDescription() {
		return "Generic data type sample";
	}

	@Override
	public void run() {
		// You specify the datatype when declaring the class object, also in the cosntructor.
        GenDemo<Integer> genDemoInt = new GenDemo<Integer>(100);
        // You can use a generic passing a primitive type
        //GenDemo<int> genTest = new GenDemo<int>("abd");
        
        // Safe type assignment
        int val = genDemoInt.getObject();
        //String str = genDemoInt.getObject();
        System.out.println(val);
        
        // Print the type
        genDemoInt.printType();
        
        // Using class with two generics
        Container<String, Boolean> containerDemo = new Container<String, Boolean>();
        containerDemo.AddElement("TALL", true);
        containerDemo.AddElement("BLONDE", false);
        containerDemo.AddElement("MALE", true);
        System.out.println(containerDemo.Count());
        if (containerDemo.getElement("MALE"))
            System.out.println("It's a male");
        else 
            System.out.println("It's a female");
        
        
        // Using generic limited to a set of possible types (extends)
        ContainerOrdered<Integer> conOrdInt = new ContainerOrdered<Integer>();
        conOrdInt.addElement(50);
        conOrdInt.addElement(34);
        conOrdInt.addElement(70);
        conOrdInt.addElement(3);
        conOrdInt.addElement(25);
        conOrdInt.addElement(168);        
        conOrdInt.addElement(1);        
        conOrdInt.addElement(5);        
        System.out.println(conOrdInt.toString());   
        
        ContainerOrdered<Character> conOrdChar = new ContainerOrdered<Character>();
        conOrdChar.addElement('G');
        conOrdChar.addElement('E');
        conOrdChar.addElement('D');     
        conOrdChar.addElement('B');     
        System.out.println(conOrdChar.toString());   
	}

}
