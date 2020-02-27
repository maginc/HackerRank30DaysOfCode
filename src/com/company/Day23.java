package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Andris Magins
 * @created 27-Feb-20
 **/
public class Day23 {

    static void levelOrder(Node3 root){
        //Write your code here
        Queue<Node3> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node3 removedNode = queue.poll();
            System.out.print(removedNode.data+" ");

            if(removedNode.left != null)
                queue.add(removedNode.left);
            if(removedNode.right != null)
                queue.add(removedNode.right);

        }

    }

    public static Node3 insert(Node3 root,int data){
        if(root==null){
            return new Node3(data);
        }
        else{
            Node3 cur;
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
        Node3 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
class Node3{
    Node3 left,right;
    int data;
    Node3(int data){
        this.data=data;
        left=right=null;
    }
}