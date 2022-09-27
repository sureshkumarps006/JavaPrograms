package com.codebind;


class Employ{
	int empid;
	String pnumber;
	String empaddress, empname;
	
	Employ(int id, String number, String address, String name){
		this.empid = id;
		this.pnumber = number;
		this.empaddress = address;
		this.empname = name;
		
		
	}
	public void display(String s1) {
		System.out.println("Employee father name:"+ s1);
	}
}


	
	class Emp_HR extends Employ{
		
		double sal;
		
		
		Emp_HR(int id, String number, String address, String name,double salaryy){
			
			super(id,number,address,name);
			this.sal = salaryy;
		}
		
	
		//Method overloading with different number of arguments
		public void getEmpWithSal() {
			System.out.println("Employee id:"+ empid + "\nEmployee mobile number:" + pnumber);
			System.out.println("Employee name:" + empname + "\nEmployee empaddress:"+ empaddress);
			System.out.println("Salary:"+sal);
		}
		
		
		//Method overriding
		public void display(String s2) {
			System.out.println("Employee father name:"+ s2);
		}
	}
	
	
	
public class Employee_Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Emp_HR e2= new Emp_HR(2,"768384757","Bangalore","suresh",25000);
		e2.getEmpWithSal();
		
		//MethodOverriding
		e2.display("Ramu");
		
		
		
	}

}