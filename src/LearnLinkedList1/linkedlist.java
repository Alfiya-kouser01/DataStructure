package LearnLinkedList1;

import java.util.LinkedList;

public class linkedlist {
        Node head;
        public void insert(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;
            if (head == null) {
                head = node;                    //to amke this element as first head node of the list
                System.out.println("This is head data : " + head.data);
            } else {
                Node n = head;
                while (n.next != null) {            // for traversing the list until the node is null reached the tail
                    n = n.next;
                }
                n.next = node;           //now we have reached to the tail node we must insert the new node next to tail
            }
        }// null at thr is replaced with the next node

            // to print the list
             public void show(){
                Node node= head;
                while(node.next!= null){
                    System.out.println(node.data);
                    node=node.next;
                }
                 System.out.println(node.data);
            }
}

