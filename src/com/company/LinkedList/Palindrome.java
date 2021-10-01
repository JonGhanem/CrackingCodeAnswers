package com.company.LinkedList;

public class Palindrome {

    public boolean isPalindrome(LinkedListNode node){
        LinkedListNode reserved = reverseNodes(node);
        return isEqual(node, reserved);
    }

    public LinkedListNode reverseNodes(LinkedListNode n){
        LinkedListNode reversed = n;
        while(n != null){
            LinkedListNode n2 = n;
            n2.next = reversed ;
            reversed = n2;
            n = n.next;
        }
        return reversed;
    }

    public boolean isEqual(LinkedListNode n1, LinkedListNode n2){
        while (n1 != null && n2 != null){
            if(n1.data != n2.data){
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        if(n1 != null || n2 != null){
            return false;
        }
        return true;
    }
}
