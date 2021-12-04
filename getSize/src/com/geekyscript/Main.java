package com.geekyscript;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println(treeSize(root));

    }
    public static int treeSize(Node root){
        if(root==null) return 0;
        else return (1+treeSize(root.left)+treeSize(root.right));
    }
}
