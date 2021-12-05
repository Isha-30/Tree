package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(10);
        root.left = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(4);
        if(isBalanced(root)>0)
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");
    }

    public static int isBalanced(Node root){
        if(root==null)
            return 0;
        int lh=isBalanced(root.left);
        if(lh==-1)return -1;
        int rh=isBalanced(root.right);
        if(rh==-1)return -1;

        if(Math.abs(lh-rh)>1)
            return -1;
        else
            return Math.max(lh,rh)+1;
    }
}
