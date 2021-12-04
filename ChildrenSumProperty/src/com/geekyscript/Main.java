package com.geekyscript;

public class Main {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(4);
        System.out.println(isSum(root));
    }

    public static boolean isSum(Node root){
        if(root == null) return true;
        if(root.left==null && root.right == null) return true;

        int sum = 0;
        if(root.left!=null) sum+=(root.left.data);
        if(root.right!=null) sum+=(root.right.data);

        return (root.data == sum && isSum(root.left) && isSum(root.right));
    }
}
