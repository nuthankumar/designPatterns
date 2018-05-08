package com.nuthan.singleton;

import java.io.Serializable;

public class SingleObject implements Cloneable, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// create an object of SingleObject
	private static SingleObject instance;

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
	}

	// Get the only object available
	public static SingleObject getInstance() {
		if (instance == null) {
			synchronized (SingleObject.class) {
				if (instance == null) {
					instance = new SingleObject();
				}
			}
		}
		return instance;
	}
	@Override
	public SingleObject clone() throws CloneNotSupportedException{
		return SingleObject.getInstance();
		
	}
	public SingleObject readResolve() {
		return SingleObject.getInstance();
	}
	public void showMessage() throws InterruptedException {
		System.out.println("Hello World!");
		Thread.sleep(1000);
	}
}
