package com.company;

import java.util.Scanner;

/**
 * @author Andris Magins
 * @created 27-Feb-20
 **/
public class Day22 {
    public static int getHeight(NodeBinary root){
        //Write your code here
        if(root == null) {
            return -1;
        }

        int left = 1 + getHeight(root.left);
        int right = 1 + getHeight(root.right);

        return Math.max(left, right);
    }

    public static NodeBinary insert(NodeBinary root,int data){
        if(root==null){
            return new NodeBinary(data);
        }
        else{
            NodeBinary cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        NodeBinary root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
class NodeBinary{
    NodeBinary left,right;
    int data;
    NodeBinary(int data){
        this.data=data;
        left=right=null;
    }
}