package com.ds.tree;

public class BST {

    // root of BSt
    Node root;

    public BST() {
        root = null;
    }

    //This method will mainly call insertRec()
    void insert(int key){
        root = insertRec(root,key);
    }
    //a recursive function to insert a new key in BST
    private Node insertRec(Node root, int key) {
            // if tree is empty return a new node
        if(root == null){
            root = new Node(key);
        }
        // otherwise, recur down the tree
        if(key < root.key){
            root.left = insertRec(root.left,key);
        }else if(key > root.key){
            root.right = insertRec(root.right,key);
        }
        return  root;
    }
    // this method mainly calls InorderRec()
    void inorder(){
        //Inorder traversal of BST always produces sorted output.
        inorderRec(root);

    }
    // function to do inorder traversal
    private void inorderRec(Node root) {
        if(root !=null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }/*else{
            System.out.println("empty");
        }*/
    }




}
