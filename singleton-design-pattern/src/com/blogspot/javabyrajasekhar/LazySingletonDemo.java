package com.blogspot.javabyrajasekhar;

public class LazySingletonDemo {

	public static void main(String[] args) {

		LazySingleton instance = LazySingleton.getInstance();
		System.out.println(instance.hashCode());
		
		
		LazySingleton instance1 = LazySingleton.getInstance();
		System.out.println(instance1.hashCode());
	}

}
