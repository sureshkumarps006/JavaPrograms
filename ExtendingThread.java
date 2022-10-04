package com.codebind;

class MainThread extends Thread{
	int i;
	public void run(){
		
			System.out.println("Main Thread"+ Thread.currentThread().getName());
		
			
	}
}
class ChildThread extends Thread{
	int i;
	public void run(){
	
			System.out.println("Child Thread"+ "-"+Thread.currentThread().getName());
		
			
	}
}
class ExtendingThread{
	public static void main(String[] args) {
		MainThread obj1 = new MainThread();
		ChildThread  obj2 = new ChildThread ();
		
		obj1.setName("MainThread");
		obj2.setName("ChildThread");

		obj1.start();
		obj2.start();

	}
}