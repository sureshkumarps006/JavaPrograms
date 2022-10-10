package com.codebind;

class TenTask extends Thread{
	public void run() {
		System.out.println("Name-"+Thread.currentThread().getName());
	}
}

public class TenTaskWithTenThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
		TenTask t1=new TenTask();
		t1.start();

	}

	}

}
