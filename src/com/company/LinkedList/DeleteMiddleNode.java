package com.company.LinkedList;

public class DeleteMiddleNode {

    public LinkedListNode deleteRandomMiddle(LinkedListNode head){
        if(head == null || head.next == null || head.next.next == null) return head;
        LinkedListNode second = head.next;
        head.next = second.next;
        return head;
    }

    public LinkedListNode deleteMiddleNode(LinkedListNode head){
        LinkedListNode fast = head;
        LinkedListNode slow = head;

        if(head == null || head.next == null || head.next.next == null) return head;
        int count = 0;
        while(fast != null){
            count ++;
            fast = fast.next;
        }
        for(int i = 0; i < (count/2)-1 ; i++){
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return slow;
    }
}
