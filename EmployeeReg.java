package com.codebind;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmployeeReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Choose one option below \n 1) Enter 1 to add email address \n "
				+ "2) Enter 2 to add Empolyee id \n "
				+ "3) Enter 3 to add phone number \n 4) Enter 4 to add address and pin address  ");
		Scanner sc = new Scanner(System.in);
		int inputnumber = sc.nextInt();
		
		
		switch(inputnumber) {
		case 1 : System.out.println("Enter email address:");
					String email = sc.next();
					String emailreg ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
					boolean emailresult = email.matches(emailreg);
					if(emailresult) {
						System.out.println("Entered Email address is valid");
					}
					else
					{
						System.out.println("Invalid Email address");
					}
					break;
		
		case 2 : System.out.println("Enter Employee Id");
					String empid = sc.next();
					String empidreg ="^AMT+\\d+$";
					boolean empidresult = empid.matches(empidreg);
					if(empidresult) {
						System.out.print("Entered Employee id is valid");
					}
					else
					{
						System.out.print("Invalid Employed id");
					}
					break;
					
					
		case 3 : System.out.println("Enter phone number");
					String phoneno = sc.next();
					String phonereg ="^[+]91[0-9]{10}|[0-9]{10}+$";
					boolean phoneresult = phoneno.matches(phonereg);
					if(phoneresult) {
						System.out.print("Entered phone number is valid");
					}
					else
					{
						System.out.print("Invalid phone number");
					}
					break;
					
		case 4 : System.out.println("Enter your address and pin code");
					String pincode = sc.next();
					String pincodereg ="^[A-Za-z0-9\\s]+\\s[1-9][0-9]{5}$";
					boolean pincoderesult = pincode.matches(pincodereg);
					if(pincoderesult) {
						System.out.print("Entered pincode is valid");
					}
					else
					{
						System.out.print("Invalid pincode");
					}
					break;
								
										
					
					
		
		}
		
		
		

	}

}
