package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int in[]={20,10,40,30,50};
        int pre[]={10,20,30,40,50};
        int n= in.length;
        Node root=cTree(in, pre, 0, n-1);

        inorder(root);
    }
    static int preIndex=0;
    public static Node cTree(int in[],int pre[],int is,int ie){
        if(is>ie)return null;
        Node root=new Node(pre[preIndex++]);

        int inIndex=is;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.data){
                inIndex=i;
                break;
            }
        }
        root.left=cTree(in, pre, is, inIndex-1);
        root.right=cTree(in, pre, inIndex+1, ie);
        return root;
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
}
