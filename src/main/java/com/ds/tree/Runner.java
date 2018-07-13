package com.ds.tree;

public class Runner {
    public static void main(String[] args) {
        BST bst = new BST();

         /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */


        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // print inorder traversal of the BST
        bst.inorder();


    }
}
