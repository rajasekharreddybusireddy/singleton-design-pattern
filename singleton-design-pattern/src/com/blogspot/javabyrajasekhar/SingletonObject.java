package com.blogspot.javabyrajasekhar;

public class SingletonObject {

	private SingletonObject() {
	}
	
	private static class SingletonHelper{
		private static final SingletonObject instance=new SingletonObject();
	}
	
	public static SingletonObject getInstance() {
		return SingletonHelper.instance;
		
	}
}
