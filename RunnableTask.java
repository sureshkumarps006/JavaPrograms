package com.codebind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class MainnClass implements Callable<Integer>{
	int i;
	public Integer call() throws InterruptedException{
//		for (i=1;i<=100 ;i++ ) {
//			return (System.out.println("Name-"+Thread.currentThread().getName()));
//		}
		Thread.sleep(300);
		return new Random().nextInt();
			
	}
}

//class ChilddThreadd implements Runnable{
//	int i;
//	public void run(){
//		for (i=1;i<=10 ;i++ ) {
//			System.out.println(i);
//		}
//	}
//}

public class RunnableTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub

		ExecutorService service=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		List<Future> lis=new ArrayList();
		for(int i=1;i<=10;i++) {
			
			
			Future<Integer> future = service.submit(new MainnClass());
			//future is a place holder
			lis.add(future);
//			System.out.println(future.get());
//			lis.remove(1);

			
		}
		
		for(Future f: lis){
//			lis.remove(0);
//			System.out.println((f.get()));
			System.out.println((f.get(2,TimeUnit.SECONDS)));
			
		}
//		service.shutdown();
//		System.out.println(lis);

		
		

	}

}
