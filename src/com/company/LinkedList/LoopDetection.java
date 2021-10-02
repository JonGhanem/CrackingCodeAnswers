package com.company.LinkedList;

public class LoopDetection {

    public boolean hasCycle(LinkedListNode head){

        if(head == null) return false;
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while(slow != fast){
            if(fast == null || slow == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
