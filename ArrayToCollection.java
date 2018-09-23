package com.nacre.collection1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToCollection {
	   public static void main(String args[]){
		   Integer []a={2,5,6,7,8,9};
		   List i=Arrays.asList(a);
		   
		   Iterator irt=i.iterator();
		   while(irt.hasNext()){
			   Object obj=irt.next();
			   Integer in=(Integer)obj;
		   
		   System.out.println(in);
		      }
		   }

}