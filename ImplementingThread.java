package com.codebind;

class MainnThread implements Runnable{
	int i;
	public void run(){
		
			System.out.println("Main Thread"+ "-"+ Thread.currentThread().getName());
		
			
	}
}
class ChilddThread implements Runnable{
	int i;
	public void run(){
	
			System.out.println("Child Thread"+ "-"+Thread.currentThread().getName());
		
			
	}
}
class ImplementingThread{
	public static void main(String[] args) {
		MainnThread obj1 = new MainnThread();
		ChilddThread  obj2 = new ChilddThread ();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.setName("MainThread");
		t2.setName("ChildThread");

		t1.start();
		t2.start();

	}
}