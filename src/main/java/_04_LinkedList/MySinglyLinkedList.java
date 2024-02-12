package _04_LinkedList;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmplty() {
        return head == null;
    }


    void addFirst(int data) {
        // create a new node object from data

        Node node = new Node(data);
        // case 1: list empty
        if (isEmplty()) {
            head = tail = node;
        } else { // case 2 : list is not empty

            node.next = head;
            head=node;
        }
        //increase size
        size++;

    }
}
