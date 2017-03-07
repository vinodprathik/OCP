package com.java.treeset.treemap;

public class TreeSetMap implements Comparable<TreeSetMap>{
	
	@Override
	 public String toString() {
	  return "Name [name=" + name + ", address=" + address + "]";
	 }

	private String name;
	private String address;
	public String getName() {
	 return name;
	}
	public void setName(String name) {
	 this.name = name;
	}
	public String getAddress() {
	 return address;
	}
	public void setAddress(String address) {
	 this.address = address;
	}
	public TreeSetMap(String name, String address) {
	 super();
	 this.name = name;
	 this.address = address;
	}
	TreeSetMap(){}
	
	@Override
	public int compareTo(TreeSetMap o) {
		
		return this.getName().compareTo(o.getName());
	}
	

}
