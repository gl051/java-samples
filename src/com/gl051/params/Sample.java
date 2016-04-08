package com.gl051.params;

import com.gl051.ISample;
import java.util.Optional;

public class Sample implements ISample {

	@Override
	public String getDescription() {
		return "How to deal with optional and default parameters in Java";
	}

	@Override
	public void run() {
		Foolish foolClass = new Foolish();
		
		// Case 1
		foolClass.fooWithMethodOverloading(100, 200);
		foolClass.fooWithMethodOverloading(100);
		
		// Case 2
		foolClass.fooWithVarArgs(100);
		foolClass.fooWithVarArgs(100, 1000, 2000);
		
		// Case 3
		foolClass.fooWithOptionalClass(100, Optional.of(10));
		foolClass.fooWithOptionalClass(100, Optional.empty());
	
	}
	

}
