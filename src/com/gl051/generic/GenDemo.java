package com.gl051.generic;


public class GenDemo<T> {
	T obj;
    
    public GenDemo(T o){
        obj = o;
    }
    
    T getObject(){
        return obj;
    }
    
    void printType(){
        System.out.println(obj.getClass().getName());
    }
}
