package com.company.LinkedList;

import java.util.HashSet;

public class RemoveDuplicated {
    public LinkedListNode removeDup(LinkedListNode head){
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode prev = null;
        while(head != null){
            if(set.contains(head.data)){
               prev.next = head.next;
            } else {
                set.add(head.data);
                prev = head;
            }
            head = head.next;
        }
        return prev;
    }
}
