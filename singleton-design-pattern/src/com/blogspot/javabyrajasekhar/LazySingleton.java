package com.blogspot.javabyrajasekhar;

public class LazySingleton {
	
	private LazySingleton() {
	}

	private static LazySingleton instance;
	
	public static   LazySingleton getInstance() {
		
		if(instance==null) {
			synchronized (LazySingleton.class) {
				if(instance==null) {
					instance=new LazySingleton();
				}
			}
			
		}
		return instance;
	}
}
