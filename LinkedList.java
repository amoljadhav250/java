/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Node{
	int data;
	Node next;
	
	Node(int d){
		data=d;
		next=null;
	}
}
class Ideone
{
	Node head;
	
	Ideone(int d){
		head=new Node(d);
	}
	
	void append(int data){
		Node t=head;
		while(t.next!=null){
			t=head.next;
		}
		t.next=new Node(data);
	}
	
	void print(){
		Node t=head;
		while(t!=null){
			System.out.println(t.data);
			t=t.next;
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone ll=new Ideone(2);
		ll.print();
		System.out.println("***********************");
		ll.append(3);
		ll.print();
		System.out.println("***********************");
		ll.append(4);
		ll.print();
		System.out.println("************4***********");
		//ll.append(5);
		System.out.println("**********5 should be printed*************");
		ll.print();
		System.out.println("***********************");
		
	}
}
