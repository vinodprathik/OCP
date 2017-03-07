package com.java.treeset.treemap;

import java.util.Set;
import java.util.TreeSet;

public class TreeMap2 {
	
	public static void main(String[] args) {

		 Set<TreeSetMap>name= new TreeSet<>(); 
		 TreeSetMap t1=new TreeSetMap("abc","xyz");
		 TreeSetMap t2=new TreeSetMap("abc","xyz");
		 TreeSetMap t3=new TreeSetMap("abc","xyz");
		 TreeSetMap t4=new TreeSetMap("abc","xyz"); 
			 
		 name.add(t1);
		 name.add(t2);
		 name.add(t3);
		 name.add(t4);
		 
		 System.out.println(name);
		 for (TreeSetMap names : name) {
		  System.out.println(names);
		 }
	
		}

}
