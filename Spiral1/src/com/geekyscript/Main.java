package com.geekyscript;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(10);
        root.left = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(4);
        printSpiral(root);
    }
    public static void printSpiral(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        boolean reverse = false;
        q.add(root);
        while (q.isEmpty() == false) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (reverse)
                    s.add(curr.data);
                else
                    System.out.print(curr.data + " ");
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            if (reverse) {
                while (s.isEmpty() == false) {
                    System.out.print(s.pop() + " ");
                }
            }
            reverse = !reverse;
        }
    }
}
