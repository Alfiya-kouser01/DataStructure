package LL2;

//{ Driver Code Starts

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class DeleteNode {
    Node head;

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter t :");
        int t = sc.nextInt();

        while (t > 0) {
            System.out.println("Enter n :");
            int n = sc.nextInt();
            //int k = sc.nextInt();
            DeleteNode llist = new DeleteNode();
            //int n=Integer.parseInt(br.readLine());
            System.out.println("Enter first node :");
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                System.out.println("Enter nodes :");
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            int x = sc.nextInt();
            //System.out.println(llist.head.data);
            GfG g = new GfG();
            //System.out.println(k);
            //System.out.println(g.getNthFromLast(llist.head,k));
            Node result = g.deleteNode(llist.head, x);
            llist.printList(result);
            t--;
        }
    }
}

class GfG {
    Node deleteNode(Node head, int x) {
        Node temp = head;
        int count=1;
        while(count<x-1){
            temp=temp.next;
            count++;
        }
        Node current = temp.next;
        temp.next=current.next;
        current.next= null;
        return head;
    }
}

