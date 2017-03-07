package com.singleton;

public class SingleTon {

	private static SingleTon singleton;
	static {
		singleton = new SingleTon();
	}
	private SingleTon() {

	}
	
	public static void main(String[] args) {
		getInstance();
		
	}

	public static SingleTon getInstance() {
		if (singleton == null) {
			synchronized (SingleTon.class) {
				if (singleton == null)
					singleton = new SingleTon();
			}
		}
		return singleton;
	}

}
