package com.codebind;
class Employeee{
	int empid;
	String pnumber;
	String empaddress, empname;
	
	Employeee(int id, String number, String address, String name){
		this.empid = id;
		this.pnumber = number;
		this.empaddress = address;
		this.empname = name;
		
	}
	public void show() {
		System.out.println("Employee id:"+ empid + "\nEmployee mobile number:" + pnumber);
		
	}
	public void showw() {
		System.out.println("Employee name:" + empname + "\nEmployee empaddress:"+ empaddress);
		
	}
}



public class EmpConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee obj1 = new Employeee(1,"8338922892", "Bangalore","Raj");
		
		obj1.show();
		obj1.showw();
		

	}

}
