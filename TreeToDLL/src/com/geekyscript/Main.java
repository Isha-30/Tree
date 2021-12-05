package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(10);
        root.left = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(4);
        Node head=BTToDLL(root);
        printlist(head);
    }

    static Node prev = null;

    public static Node BTToDLL(Node root){
        if(root==null)return root;

        Node head=BTToDLL(root.left);
        if(prev==null){head=root;}
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        BTToDLL(root.right);
        return head;
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" <--> ");
            curr=curr.right;
        }
    }
}
