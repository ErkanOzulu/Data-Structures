package _04_LinkedList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList mylist1 = new MySinglyLinkedList();

        System.out.println(mylist1.isEmpty());
        for (int i = 0; i <10 ; i++) {
            mylist1.add(i);
        }
        mylist1.printNodes();



        MySinglyLinkedList mylist2 = new MySinglyLinkedList();
        mylist1.add(1);
        mylist1.add(3);
        mylist1.add(6);
        mylist1.add(7);
        mylist2.add(2);
        mylist2.add(4);
        mylist2.add(5);

//
//        Node newHead = MergeTwoLinkedList.mergeLinkedLists(mylist1.head, mylist2.head);
//
//        while (newHead != null) {
//            System.out.println(newHead.id);
//            newHead = newHead.next;
//        }


    }
}