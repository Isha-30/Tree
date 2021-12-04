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

        System.out.println("Max element is: "+getMax(root));

    }

    public static int getMax(Node root){
        if(root == null) return Integer.MIN_VALUE;
        else
            return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
    }
}
