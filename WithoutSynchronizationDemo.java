package com.codebind;
class Syn {
	int count=0;
	void increment(){
	count++;	
	}
}
class T1 extends Thread
{
	Syn ob1=new Syn();
	public void run() {
		
		for(int i=1;i<=100;i++) {
			ob1.increment();
			System.out.println(ob1.count);
		}
		
	}
}
class T2 extends Thread
{
	Syn ob2=new Syn();
	public void run() {
		
		for(int i=1;i<=100;i++) {
			ob2.increment();
			System.out.println(ob2.count);
		}
		
	}
}


public class WithoutSynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Syn ob=new Syn();

		
		T1 t1= new T1();
		
		T2 t2= new T2();
		
		t1.start();
		t2.start();
		System.out.println(ob.count);

	}

}
