package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.right = new Node(60);
        int k = 2;
        NodeAtK(root, k);
    }

    public static void NodeAtK(Node root, int k){
        if(root == null) return;
        else if(k==0) System.out.print(root.data + " ");
        else{
            NodeAtK(root.left, k-1);
            NodeAtK(root.right, k-1);
        }
    }
}
