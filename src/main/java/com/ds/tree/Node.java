package com.ds.tree;

public class Node {
    // Class containing left and right child of current node and key value

    int key;
    Node left,right;

    // constructor to create a new node
    public Node(int item){
        key =item;
        left = right =null;
    }

}
