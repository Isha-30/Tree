package com.geekyscript;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right = new Node(50);
        root.right.left = new Node(60);

        printLevelOrder(root);
    }

    public static void printLevelOrder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Node curr=q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }
}
