package com.ds.singlelinkedlist;

public class LinkedList {
            /*A node can be added in three ways
                    1) At the front of the linked list
                    2) After a given node.
                    3) At the end of the linked list.*/
            Node head; // head of list
       // Insert a new node at front of the list
        public void push(int new_data){
            // allocate node and put data
            Node new_node = new Node(new_data);
            // make the next of new to point to head(i.e. first element)
            new_node.next = head;
            // move head  to point to new node
            head = new_node;
        }

        // Insert a new node after a given node prev_node
    public void insertAfter(Node prev_node,int new_data){
            // check if given prev node is null
        if(prev_node == null){
            System.out.println("previous node can't be null: ");
            return;
        }
        // Allocate the node and put data
        Node new_node = new Node(new_data);
        // make next of new node as next of prev_node
        new_node.next = prev_node.next;
        // make next of prev node as new node
        prev_node.next = new_node;

    }

    // append a new node at end
    public void append(int new_data){
            // allocate node, put data, set next as null;
        //System.out.println("append called "+new_data);
        Node new_node = new Node(new_data);
        // if linked list is empty then make new node as head
        if(head == null){
            //System.out.println(" head is null while appending");
            head = new Node(new_data);
            return;
        }
        // new node is going to be last node so make next of new node as null;
        //System.out.println(" head is not null while appending");
        new_node.next = null;
        // traverse till last of node
        Node last =head; // start from first and traverse till last
        while(last.next!=null){
            //System.out.println(" inside while appending");
            last = last.next;
        }

        // change the next of last node
        //System.out.println(" last before append: "+last.data);
        last.next=new_node;
       // System.out.println(" last after append: "+last.next.data);
        return;
    }

    // Delete first occurrence of a given key
    public void deleteNode(int key){
            // we need head, prev and temp
        // store head node
        Node temp = head;
        Node prev=null;

        // if head node itself hold the key to be deleted
        if(temp!=null && temp.data==key){
            head=temp.next;
            return;
        }
    // search for key to be deleted, keep track of previous node as we need to change
        // temp.next
        while (temp!=null && temp.data!=key){
            prev =temp;
            temp=temp.next;
        }

        // if key was not present  in linked list
        if(temp == null) return;

        // unlink the previous node from linked list
        prev.next = temp.next;



    }

    // Print the contents of linked list
    public void printList(){
            Node tNode = head;
            while (tNode.next !=null){
                // while loop will print till 2nd last element as next of last is null
                System.out.print("\t"+tNode.data);
                tNode =tNode.next;
            }
            // print last node
        System.out.println("\t"+tNode.data);
    }




}
