package com.design.singleton;

public class SingleObject {
	
	//create an object of SingleObject 
	private static SingleObject instance = new SingleObject();
	//make the constructor private so that this class cannot be 
	//instantiated 
	private SingleObject(){} 
	//Get the only object available 
	public static synchronized SingleObject getInstance(){ 
		if(instance == null){
			instance = new SingleObject();
		}
		return instance;
		}
	public void showMessage() throws InterruptedException{ 
		System.out.println("Hello World!"); 
		Thread.sleep(1000);
		}
	}
