package com.blogspot.javabyrajasekhar;

public class EagerSingleton {

	public static void main(String[] args) {

		Singleton instance = Singleton.getInstance();
		System.out.println(instance.hashCode());
		
		
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance1.hashCode());
	}

}
