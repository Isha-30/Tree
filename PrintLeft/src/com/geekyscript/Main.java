package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        printLeftView(root);
    }
    static int maxlevel = 0;
    static void printLeft(Node root, int level){
        if(root == null) return;
        if(maxlevel<level){
            System.out.print(root.data + " ");
            maxlevel = level;
        }
        printLeft(root.left, level+1);
        printLeft(root.right, level+1);
    }

    public static void printLeftView(Node root){
        printLeft(root, 1);
    }

}
