package com.Applicant.practice.CoreJava.DSA.linkList;

class DNode{
    int data;
    DNode next;
    DNode prev;

    public DNode(int data) {
        this.data = data;
        this.next=null;
        this.prev=null;
    }
}
public class DoublyLinkedList {
    DNode head;
    DNode tail;
    int size;
    public void addFirst(int data){
        DNode node=new DNode(data);
        if(head==null){
            head=tail=node;
        }
        node.next=head;
        //node.prev=
    }
    public static void main(String[] args) {
        DoublyLinkedList d=new DoublyLinkedList();

    }
}
