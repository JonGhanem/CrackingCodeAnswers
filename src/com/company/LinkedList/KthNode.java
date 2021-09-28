package com.company.LinkedList;

public class KthNode {

    public LinkedListNode getNode(LinkedListNode head, int index){
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        int count = 0;
        while(fast != null){
            count ++;
            fast = fast.next;
        }
        for(int i = 0; i < (count-index-1) ; i++){
            slow = slow.next;
        }
        return slow;
    }
}
