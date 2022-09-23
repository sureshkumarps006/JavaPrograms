package com.codebind;

import java.util.ArrayList;

class B{
	String emptype;
	int empid;
	String pnumber, empaddress, empname;
	
public B(int id, String number, String address, String name, String type) {
	this.empid = id;
	this.pnumber = number;
	this.empaddress = address;
	this.empname = name;
	this.emptype=type;
	
}	
}
public class ContinueImp {
	public static void main(String[] args) {
	    B e1=  new B(18, "8338922892", "Bangalore","Ramu","HR");
	    B e2=  new B(43, "8739092890","Mangalore","Raghava","TR");
	    B e3=  new B(744, "9847030303","Hubli","Sonu","ADMIN");
	    B e4=  new B(15, "9764874903","Mysooru","Sanju","HR");
	    B e5=  new B(185, "8947463798","Dharwad","Lohith","TR");
	    B e6=  new B(97, "8647839894","Bangalore","Sonu","MR");
	    B e7=  new B(93, "8493838388","Tumkuru","Lokesh","HR");
	    B e8=  new B(121, "9648749399","Bidar","Rakesh","ADMIN");
	    B e9=  new B(38, "8976460987","Dharwad","Suma","MR");
	    B e10=  new B(879, "8647839894","Bangalore","Sampath","HR");

	    ArrayList<B> empArr = new ArrayList<>();

	    empArr.add(e1);
	    empArr.add(e2);
	    empArr.add(e3);
	    empArr.add(e4);
	    empArr.add(e5);
	    empArr.add(e6);
	    empArr.add(e7);
	    empArr.add(e8);
	    empArr.add(e9);
	    empArr.add(e10);
	    


	    for (B emp : empArr)
	    {
	        if(emp.empid%2 ==0)
	        {
	            continue;
	            
	        }
	        
	        System.out.println("Employee id:"+ emp.empid + "\nEmployee mobile number:" + emp.pnumber+"\nEmployee Type:"+emp.emptype);
	        System.out.println("Employee name:" + emp.empname + "\nEmployee empaddress:"+ emp.empaddress);
	        System.out.println(" ");
	       
	}

}
}
