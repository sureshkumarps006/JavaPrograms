package com.codebind;

class Synchro {
	int count=0;
	void increment(){
		System.out.println("Name-"+Thread.currentThread().getName());
		synchronized (this) { 
	count++;	
		}
	}

}

public class SynchronizationBlockDemo{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Synchro ob=new Synchro();

	class TT1 extends Thread
		{
//			Syn ob1=new Syn();
			public void run() {
				
				for(int i=1;i<=1000;i++) {
					ob.increment();
//					System.out.println(ob.count);
				}
				
			}
		}
		
		
		class TT2 extends Thread
		{
//			Syn ob2=new Syn();
			public void run() {
				
				for(int i=1;i<=1000;i++) {
					ob.increment();
//					System.out.println(ob.count);
				}
				
			}
		}

		TT1 t1= new TT1();
		
		TT2 t2= new TT2();
		
	
		t1.start();
		t2.start();
//		t1.join();
//		t2.join();
		Thread.sleep(1000);
		System.out.println(ob.count);

	}

}
