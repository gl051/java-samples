package com.gl051.generic;

import java.util.Hashtable;

//You can specify more than one generic, you list them separated by comma
public class Container<T,V> {
 
 // T and V in the class declaration are just placeholder for types defined at run time
 Hashtable<T,V> map = new Hashtable<T,V>();
 
 public void AddElement(T key, V value){
     map.put(key, value);
 }
 
 public V getElement(T key){
     return map.get(key);
 }
 
 public int Count(){
     return map.size();
 }
}

