package com.codebind;

class Emplo{
	int empid;
	String pnumber;
	String empaddress, empname;
	
	Emplo(int id, String number, String address, String name){
		this.empid = id;
		this.pnumber = number;
		this.empaddress = address;
		this.empname = name;
		
		
	}
	public void display(String s1) {
		System.out.println("Employee father name:"+ s1);
	}
}


	
	class HR extends Emplo{
		
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
		
		
		//Method overriding
		public void display(String s2) {
			System.out.println("Employee father name:"+ s2);
		}
	}
	
	
	
	
public class Employeeoverloadingandoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Emplo e1= new Emplo(1,"6758585673","Dharwad","Ravi");
		HR e2= new HR(2,"768384757","Bangalore","suresh",25000);
		
		
		//MethodOverloading
		e2.getEmpWithSal();
		e2.getEmpWithSal(36000);
		
		//MethodOverriding
		e1.display("Ravi");
		e2.display("Ramu");
		
		
		
	}

}
