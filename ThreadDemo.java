package com.codebind;

class MainThreadd extends Thread{
	int i;
	public void run(){
		for (i=1;i<=10 ;i++ ) {
			System.out.println(i);
		}
			
	}
}
class ChildThreadd extends Thread{
	int i;
	public void run(){
		for (i=1;i<=10 ;i++ ) {
			System.out.println(i);
		}
			
	}
}
class ThreadDemo{
	public static void main(String[] args) throws InterruptedException {
		MainThreadd obj1 = new MainThreadd();
		ChildThreadd  obj2 = new ChildThreadd ();
		
		

		obj1.start();
		obj1.join();
		obj2.start();

	}
}