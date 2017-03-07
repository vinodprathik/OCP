package com.java.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;

import hashSetHashMap.Student;

public class ArrayListExample {
	

	 public static void main(String[] args) {
	  List<String> list= new ArrayList<>();
	  list.add("one--1");
	  list.add("two--2");
	  list.add("three--3");
	  list.add("four--4");
	  list.remove("three--3");
	  list.add("six--6");
	  list.remove("two--2");
	  Collections.sort(list);
	  
	  
	  for (String string : list) {
	   System.out.println(string);
	  }
	  System.out.println("----------------------------------");
	 
	  List<Integer> num= new ArrayList<>();
	  num.add(1);
	  num.add(2);
	  num.add(3);
	  num.add(4);
	  num.remove(2);
	  Collections.sort(num);
	  for (Integer number : num) {
	   System.out.println(number);
	  }
	  System.out.println("----------------------------------");

	 }

}
