package com.company.LinkedList;

public class KthNode {


    public LinkedListNode removeNthFromEnd(LinkedListNode head, int n) {

        LinkedListNode start = new LinkedListNode(0);
        LinkedListNode slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }


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
