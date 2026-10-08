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
                newNode.next = head;
                head = newNode;
            }
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        

	}
}
