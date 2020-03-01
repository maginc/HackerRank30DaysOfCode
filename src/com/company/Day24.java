package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Andris Magins
 * @created 01-Mar-20
 **/
public class Day24 {

    public static Node4 removeDuplicates(Node4 head) {
        //Write your code here
        if (head==null)
            return null;
        Set<Integer> set =new HashSet<Integer>();
        Node4 prevNode = head;
        Node4 n =prevNode.next;
        if(n==null)
            return head;
        set.add(prevNode.data);

        while(n!=null)
        {
            if(set.contains(n.data))
            {
                prevNode.next=n.next;
                n=n.next;
            }
            else{
                set.add(n.data);
                prevNode=n;
                n=n.next;
            }
        }
        return head;
    }

    public static  Node4 insert(Node4 head,int data)
    {
        Node4 p=new Node4(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node4 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node4 head)
    {
        Node4 start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node4 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
class Node4{
    int data;
    Node4 next;
    Node4(int d){
        data=d;
        next=null;
    }

}