package com.gl051;

public class JavaSamples {

    public static void main(String[] args) {
        System.out.println("*** Tour De Java ***");
        ISample s = getSample();
        System.out.println("Sample description: " + s.getDescription());
        s.run();
    }
    
    // Get the Sample to execute 
    private static ISample getSample(){
        return new com.gl051.string.Sample();
    }

}
