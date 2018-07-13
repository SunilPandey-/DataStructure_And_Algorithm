package com.ds.singlelinkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(6);
        list.push(7);
        list.push(1);
        list.append(4);
        //list.append(3);
        //list.append(10);
        // insert 8 after 7
        list.insertAfter(list.head.next,8);

        System.out.println(" Created list is as below: ");
        list.printList();

        list.deleteNode(6);

        System.out.println(" Modified list is as below: ");
        list.printList();

    }
}
