package com.blogspot.javabyrajasekhar;

public class App {

	public static void main(String[] args) {

		SingletonObject instance = SingletonObject.getInstance();
		System.out.println(instance.hashCode());

		SingletonObject instance1 = SingletonObject.getInstance();
		System.out.println(instance1.hashCode());
	}

}
