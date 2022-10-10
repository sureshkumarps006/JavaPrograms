package com.codebind;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TenThreads extends Thread{
	public void run() {
		System.out.println("Name-"+Thread.currentThread().getName());
	}
}

public class HundredTaskWithTenThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i=1;i<100;i++)
		{
			service.execute(new TenThreads());
		}
	}

}
