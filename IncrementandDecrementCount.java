package com.codebind;

class Myclass extends Thread{
	static int count=0;
	void inc(){
		
		count++;
		
	}
		
		
	void dec(){
		
		try { Thread.sleep(100);
		count--;
		}
//		
		catch(Exception e) {
	}
	}
	public void run() {
		inc();
		System.out.println(count+"-"+Thread.currentThread().getName());
		dec();
		System.out.println(count+"-"+Thread.currentThread().getName());
	}
}
public class IncrementandDecrementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass t1= new Myclass();
		Myclass t2= new Myclass();
		
		t1.start();
		t2.start();
//		try { Thread.sleep(100);}
//		catch(Exception e) {
//			}
//			

		
		

	}

}
