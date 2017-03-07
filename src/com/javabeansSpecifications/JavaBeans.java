package com.javabeansSpecifications;

public class JavaBeans {
	
	private String car;
	private String color;
 
	public String getCar() {
	 return car;
	}
	public void setCar(String car) {
	 this.car = car;
	}
	public String getColor() {
	 return color;
	}
	public void setColor(String color) {
	 this.color = color;
	}

	public boolean isTrue(){
	 return true;
	}
	
	
	public static void main(String[] args) {
		JavaBeans jb = new JavaBeans();
		jb.setCar("BMW");
		jb.setColor("BLACK");
		System.out.println("Car = "+jb.getCar()+" ,"+ "Color = "+jb.getColor());
		
		
	}
}
