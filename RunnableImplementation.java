package com.codebind;

class MainnThreadd implements Runnable{
	int i;
	public void run(){
		for (i=1;i<=10 ;i++ ) {
			System.out.println(i);
		}
			
	}
}
class ChilddThreadd implements Runnable{
	int i;
	public void run(){
		for (i=1;i<=10 ;i++ ) {
			System.out.println(i);
		}
	}
}
class RunnableImplementation {
	public static void main(String[] args) throws InterruptedException {
		MainnThreadd obj1 = new MainnThreadd();
		ChilddThreadd  obj2 = new ChilddThreadd ();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t1.join();
		t2.start();

	}
}