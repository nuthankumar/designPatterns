package com.nuthan.singleton;

public class SingletonPatternDemo { 
	
	public static void main(String[] args) throws InterruptedException { 
		//illegal construct 
		//Compile Time Error: The constructor SingleObject() is not visible 
		//SingleObject object = new SingleObject(); 
		//Get the only object available 
		SingleObject object = SingleObject.getInstance();
		//show the message 
		object.showMessage();
		Thread t1= new Thread(){
			public void run(){
				SingleObject object = SingleObject.getInstance();
				try {
					SingleObject cloneobject=object.clone();
					System.out.println(cloneobject.hashCode());
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					object.showMessage();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(object.hashCode());
				System.out.println("thread 1");
				
			}
		};
		Thread t2= new Thread(){
			public void run(){
				SingleObject object = SingleObject.getInstance();
				try {
					SingleObject cloneobject=object.clone();
					System.out.println(cloneobject.hashCode());
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					object.showMessage();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(object.hashCode());
				System.out.println("thread 2");

			}
		};
		t1.start();
		t2.start();
		}
	}

