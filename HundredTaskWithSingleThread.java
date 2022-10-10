package com.codebind;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingleThread extends Thread{
	public void run() {
		System.out.println("Name-"+Thread.currentThread().getName());
	}
}

public class HundredTaskWithSingleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		for(int i=0;i<100;i++)
		{
			service.execute(new SingleThread());
		}

	}

}
