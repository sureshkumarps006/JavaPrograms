package com.codebind;

import java.util.HashMap;

class Employe2{
	int id;
	String empname;
	
	Employe2(int id, String empname){
		this.empname=empname;
		this.id=id;
		
	}
	public String toString()
	{
		return id+" :"+empname;
	}
	
}
public class EmployeeHashMapWithOutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe2 obj1= new Employe2(1,"anc");
		Employe2 obj2= new Employe2(2,"dfd");
		Employe2 obj3= new Employe2(3,"gsg");
		Employe2 obj4= new Employe2(4,"dh");
		
		HashMap <Employe2,Integer> map=  new HashMap();
		map.put(obj1,1);
		map.put(obj2,6);
		map.put(obj3,8);
		map.put(obj3,8);
		System.out.println(map);

	}

}
