package com.codebind;

class Emp{
	int empid;
	String pnumber;
	String empaddress, empname;
	
	Emp(int id, String number, String address, String name){
		this.empid = id;
		this.pnumber = number;
		this.empaddress = address;
		this.empname = name;
				
	}
}

	
	class HR extends Emp{
		
		double sal;
		
		
		HR(int id, String number, String address, String name,double salaryy){
			
			super(id,number,address,name);
			this.sal = salaryy;
		}
		
		//Method overloading with different number of arguments
		public void getEmpWithSal() {
			System.out.println("Employee id:"+ empid + "\nEmployee mobile number:" + pnumber);
			System.out.println("Employee name:" + empname + "\nEmployee empaddress:"+ empaddress);
			System.out.println("Salary:"+sal);
		}
		
		public void getEmpWithSal(int tax)
		{
			System.out.println("Employee id:"+ empid + "\nTAX:"+tax);
		}
		
	}
		
	
	
public class Employee_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Emp e1= new Emp(1,"6758585673","Dharwad","Ravi");
		HR e2= new HR(2,"768384757","Bangalore","suresh",25000);	
		
		//MethodOverloading
		e2.getEmpWithSal();
		e2.getEmpWithSal(36000);
			
		
	}

}
