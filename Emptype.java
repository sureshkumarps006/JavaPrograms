package com.codebind;

class A{
	String emptype;
	int empid;
	String pnumber, empaddress, empname;
	
public A(int id, String number, String address, String name, String type) {
	this.empid = id;
	this.pnumber = number;
	this.empaddress = address;
	this.empname = name;
	this.emptype=type;
	
}

void disp() {
	if(emptype=="HR") {
		System.out.println("Employee id:"+ empid + "\nEmployee mobile number:" + pnumber+"\nEmployee Type:"+emptype);
	}
	else if(emptype=="TR") {
		System.out.println("Employee id:"+ empid + "\nEmployee mobile number:" + pnumber+"\nEmployee Type:"+emptype);
	}
	else if(emptype=="MR") {
		System.out.println("Employee id:"+ empid + "\nEmployee mobile number:" + pnumber+"\nEmployee Type:"+emptype);
	}
	else {
		System.out.println("Not Matching");
	}
}


void sw() {
	switch(emptype) {
	case "HR": System.out.println("Employee id:"+ empid + "\nEmployee mobile number:" + pnumber+"\nEmployee Type:"+emptype);
				break;
	case "TR": System.out.println("Employee id:"+ empid + "\nEmployee mobile number:" + pnumber+"\nEmployee Type:"+emptype);
				break;
	case "MR": System.out.println("Employee id:"+ empid + "\nEmployee mobile number:" + pnumber+"\nEmployee Type:"+emptype);
				break;			
	default : System.out.print("Not Matching");
				break;
	
	}
}
	
}

public class Emptype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj1=new A(1,"8338922892", "Bangalore","Ramu","HR");
		A obj2=new A(2,"8739092890","Mangalore","Raghava","TR");
		A obj3=new A(3,"9847030303","Bangalore","Sonu","ADMIN");
		obj1.disp();
		obj2.disp();
		obj3.disp();
		
		obj1.sw();
		obj2.sw();
		obj3.sw();

	}

}
