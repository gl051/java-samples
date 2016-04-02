package com.gl051.generic;

import java.util.ArrayList;
import java.util.List;

public class ContainerOrdered<T extends Comparable<T>> {
        
        ArrayList<T> elements = new ArrayList<T>();
        
        public void addElement(T newElement){
            
            if (elements.size() == 0){
                elements.add(newElement);
                return;
            }
            
            int indexGt = 0;
            for(T element : elements){
                if (element.compareTo(newElement) > 0)
                    break;
                indexGt++;
            }
            
            if( (indexGt != 0) && (indexGt + 1 == elements.size()))
                elements.add(newElement);
            else{ 
                List<T> after = elements.subList(indexGt, elements.size());
                List<T> before = elements.subList(0, indexGt);
                ArrayList<T> tmpList = new ArrayList<T>(before);
                tmpList.add(newElement);
                tmpList.addAll(after);
                elements = tmpList;
            }
        }
        
        @Override
        public String toString(){
            StringBuilder strbld = new StringBuilder();
            String prefix = "";
            for(T el : elements){
                strbld.append(prefix);
                prefix = ",";
                strbld.append(el.toString());
            }
            
            return strbld.toString();            
        }

}
