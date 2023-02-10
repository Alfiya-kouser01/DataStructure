package DoublyLinkedlist;

import static DoublyLinkedlist.Insertion.*;

public class Main {
    public static void main(String[] args) {

        Insertion method = new Insertion();
        method.insertAtTail(1);
        insertAtTail(2);
        insertAtTail(3);
        insertAtTail(4);
        insertAtTail(5);
        System.out.print("After insert at tail");
        method.display(head);
        System.out.print("After insertion st head");
        method.display(head);
    }
}

