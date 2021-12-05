package com.geekyscript;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(10);
        root.left = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(4);

        System.out.println(maxWidth(root));
    }

    public static int maxWidth(Node root){
        if(root==null)return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int res=0;
        while(q.isEmpty()==false){
            int count=q.size();
            res=Math.max(res,count);
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return res;
    }
}
