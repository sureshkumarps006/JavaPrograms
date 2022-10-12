package com.codebind;

class OE {
	
	synchronized public void odd() throws InterruptedException 
	{
		
		for(int i=1;i<=10;i++) 
		{
			if(i%2!=0) 
				
			{
				wait();
				
			}
			else
			{
				notifyAll();
				
				Thread.sleep(1000);
				System.out.println("Even:"+i);
				System.out.println("Name-EvenThread"+Thread.currentThread().getName());
			}
		}
	
	}
	
	synchronized public void even() throws InterruptedException 
	{
//		synchronized(this) {
		for(int i=1;i<=10;i++) 
		{
			if(i%2==0) 
			{
				
				wait();
			}
			else {
				notifyAll();
				Thread.sleep(1000);
				System.out.println("Odd:"+i);
				System.out.println("Name-OddThread-"+Thread.currentThread().getName());
				
			}
		}
	}
}


class OddEven{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OE ob1=new OE();
//		ob1.start();
		
		class Thread1 extends Thread{
			
			public void run() {
				try {
					ob1.odd();
//					ob1.even();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
class Thread2 extends Thread{
			
			public void run() {
				try {
					//ob1.odd();
					ob1.even();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		Thread1 t1=new Thread1();
		
		Thread2 t2=new Thread2();
		
		t1.start();
		t2.start();
//		

	}

}
