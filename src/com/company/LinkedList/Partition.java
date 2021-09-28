package com.company.LinkedList;

public class Partition {

    public LinkedListNode partitionByValue(LinkedListNode node, int value){
        if(node == null || node.next == null) return node;
        LinkedListNode head = node;
        LinkedListNode tail = node;

        while(node != null){
            if(node.data < value){
                head = node ;
                head = head.next;
            } else {
                tail.next = node;
            }
            node = node.next;
        }
        tail.next = null;
        head.next = tail ;
        return head;

    }
}
