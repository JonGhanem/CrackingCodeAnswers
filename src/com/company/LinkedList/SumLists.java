package com.company.LinkedList;

public class SumLists {

    public LinkedListNode SumTwoLinkedLists(LinkedListNode n1, LinkedListNode n2){
        boolean remaining = false;
        LinkedListNode head = new LinkedListNode();
        int sum = 0;

        while(n1 != null){
            if(remaining){
                sum = n1.data + n2.data + 1;
            } else {
                sum = n1.data + n2.data;
            }
            if(sum > 9){
                head = new LinkedListNode((sum)%10);
                remaining = true;
            } else {
                head = new LinkedListNode(sum);
                remaining = false ;
            }
            System.out.print(head.data);
            head = head.next;
            n2 = n2.next;
            n1 = n1.next;
        }
        return head;
    }
}
