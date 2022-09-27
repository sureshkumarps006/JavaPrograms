package com.codebind;

public class ExceptionHandling_IndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			
	try {
		int i=0;
			try {
				
				int[] arr= new int[5];
				//arr[6]=5;
				System.out.println(arr[6]);
			} 
			catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
			int result = 10/i;
			System.out.println(result);
			
			
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println(e);
	}
			
	finally {
				
			System.out.println("Finally statement excecuted");
			}
			
			
	
	}

}
