package DoublyLinkedlist;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Insertion {
    static Node head = null;

    static void inserAtHead(int value){
        Node n=new Node(value);
        n.next=head;
        if(head!=null){
            head.prev=n;
        }
        head =n;
    }
    static void insertAtTail(int value){
        if(head==null){
            inserAtHead(value);
            return;
        }
        Node n=new Node(value);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        n.prev=temp;
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null);
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
}
