package com.codebind;


class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
		
	}
	
}

class Mll{
	Node add(int data)
	{
		Node nn=new Node(data);
		return nn;
		
		 //if list is empty, head and tail points to newNode
	}
	
	int findLastNode(Node n)
	{
	

		 while(n.next!=null){
	            n = n.next;
	        }
	        return n.data;
	}
	
}


public class CollectionImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mll ob1= new Mll();
Node n1 = ob1.add(5);
Node n2 = ob1.add(6);
Node n3 = ob1.add(8);
Node n4 = ob1.add(9);

n1.next=n2;
n2.next=n3;
n3.next=n4;
n4.next=null;

//ob1.findLastNode(n1);
//int N = n1.next.next.next.data;
//System.out.println(N);
System.out.println(ob1.findLastNode(n1));

	}

}
