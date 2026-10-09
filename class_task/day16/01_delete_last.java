import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Codechef {

    static Node head = null;

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }
    static void deletefirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
	    {
	        System.out.println("List is Empty");
	    }
	    while (head != null) {
            head = head.next;
        }
        System.out.println("Nodes are deleted");
        
    }
    
    static void deletelast()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        while(head!=null)
        {
            
            Node temp = head;
            if(head.next == null)
            {
                head = null;
                System.out.println("All nodes are deleted");
            }
            else{
                while(temp.next.next!=null)
                {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            insert(data);
        }

        display();
        System.out.println();
        deletelast();
    }
}