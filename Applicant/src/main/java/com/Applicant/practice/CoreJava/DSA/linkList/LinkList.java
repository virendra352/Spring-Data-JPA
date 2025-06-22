package com.Applicant.practice.CoreJava.DSA.linkList;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkList {
    Node head;
    Node tail;
    int size;

    public void AddFront(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
            size++;
            return;
        }else{
            node.next=head;
            head=node;
            size++;
        }
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + " , ");
            temp=temp.next;
        }
        System.out.println("\n");
    }
    public void addEnd(int data){
        Node node=new Node(data);
        Node temp=head;
         while(temp.next!=null){
             temp=temp.next;
         }
         temp.next=node;
         tail=node;
         size++;
    }
    public void addPosition(int data,int position){
        Node node=new Node(data);
        int i=0;
        if(i==position){
            AddFront(data);
        } else if (position>size) {
            System.out.println("entered node position is invalid !!, please provide right position !!!");
            return;
        } else if (position==size) {
            addEnd(data);
        }else {
            Node curr=head;
            Node pre=null;
            while (i<position){
                pre=curr;
                curr=curr.next;
                i++;
            }
            pre.next=node;
            node.next=curr;
            size++;
        }
    }

    public void delete(int position){

        if(position==0){

        }
    }
    public void deleteFront(){
        if(head==null){
            System.out.println("LinkList is empty....");
        }else {
           head=head.next;
           size--;
        }
    }
    public void deleteEnd(){
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        System.out.println("Deleted end Node data is : "+temp.data);
        temp.next=null;
        tail=temp;
        System.out.println("Tail Node data is : "+temp.data);
        size--;
    }

    public void deleteAtPosition(int position){
        Node temp=head;
        int i=0;
        if(head==null){
            return;
        } else if (position==size) {
            deleteEnd();
        } else if (position==0) {
            deleteFront();
        }else {
            while(i<position-1){ // 1 2 3 4 5 6 // 1 2 3 5 6
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
            size--;
        }

    }


    public static void main(String[] args) {
        LinkList l=new LinkList();
        l.AddFront(10);
        l.AddFront(5);
        System.out.println(l.head);

        l.addEnd(20);
        l.addPosition(6,1);
        l.addPosition(30,5);
        l.display();
        l.deleteAtPosition(2);
        l.display();
        System.out.println(l.size);
    }

}
