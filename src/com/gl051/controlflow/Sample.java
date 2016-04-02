package com.gl051.controlflow;

import com.gl051.ISample;

public class Sample implements ISample {

	@Override
	public String getDescription() {
		return "Control Flow Statements explained with code sample";
	}

	@Override
	public void run() {
		runForLoop();		
	}
	
	private void runForLoop(){
		String[] names = {"James", "Brandon", "Jennifer", "Tobias", "Alex"};
		
		// FOR loop statement
		
		// FOR loop Method 1 = general form
		for (int i = 0; i < names.length; i++)
		{
			System.out.print(names[i] + ", ");
		}
		System.out.println();
		
		// Method 2 - enhanced form usable with collections
		for(String n : names)
		{
			System.out.print(n + ", ");
		}
		System.out.println();
	}

}
