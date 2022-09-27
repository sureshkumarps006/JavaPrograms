package com.codebind;

class InvalidAgeException extends Exception{
	InvalidAgeException(String s)
	{
		super(s);
	}
	
}
public class ExceptionHandling_AgeValidationCustomExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int age = 17;
		if(age<18) {
			throw new InvalidAgeException("Your minor not eligible ");
		}
		else {
			System.out.println("Your Major eligible");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
