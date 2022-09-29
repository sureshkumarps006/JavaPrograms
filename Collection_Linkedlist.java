package com.codebind;


class LinkedList{
class Node{
	int data;
	Node next;
	Node previous;
	Node(int data){
		this.data=data;
		
		
	}
	
}
Node head, last = null;

	public void add(int data)
	{
		Node newnode=new Node(data);
		//return newnode;
		
		
        if(head == null) {
            head = last = newnode; 
            head.previous = null;
            last.next = null;
        }
        else {

            last.next = newnode;    
            last.previous = last;
            last = newnode;
            last.next = null;
        }
	}
	
	public void DisplayNode()
	{
		 Node a = head;

	        while(a != null) {
	            System.out.println(a.data + " ");
	            a = a.next;
	
	}
}
}

public class Collection_Linkedlist{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ob1= new LinkedList();

ob1.add(5);
ob1.add(6);
ob1.add(8);
ob1.add(9);
ob1.add(11);

ob1.DisplayNode();
//System.out.println(ob1.DisplayNode());

	}

}
