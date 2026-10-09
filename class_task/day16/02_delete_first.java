import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    Node head = null;
	    for(int i = 0; i<n; i++)
	    {
	        Node newNode = new Node(sc.nextInt());
	        if(head == null)
	        {
	            head = newNode;
	        }
	        else{
	            Node current = head;
	            while(current.next != null)
	            {
	              current = current.next;  
	            }
	            current.next = newNode;
	        }
	    }
	    Node temp = head;
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    }
	    if(head == null)
	    {
	        System.out.println("List is Empty");
	    }
	    while (head != null) {
            head = head.next;
        }
        System.out.println("Nodes are deleted");
	}
}
