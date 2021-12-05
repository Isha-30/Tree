package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(10);
        root.left = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(4);
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(Node root){
        if(root==null)
            return true;
        int lh=height(root.left);
        int rh=height(root.right);
        return (Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right));
    }

    public static int height(Node root){
        if(root==null)
            return 0;
        else
            return (1+Math.max(height(root.left),height(root.right)));
    }
}
