package com.company.LinkedList;

import java.util.HashSet;
import java.util.List;

public class Intersection {

    public LinkedListNode isIntersected(LinkedListNode n1, LinkedListNode n2){
        if(n1 == null || n2 == null) return null;
        HashSet<LinkedListNode> set = new HashSet<>();
        while(n1 != null || n2 != null){
            if(n1 != null){
                if(set.contains(n1)){
                    return n1;
                } else {
                    set.add(n1);
                }
                n1 = n1.next;
            }
            if(n2 != null){
                if(set.contains(n2)){
                    return n2;
                } else {
                    set.add(n2);
                }
                n2 = n2.next;
            }
        }
        return null;
    }

    public LinkedListNode getIntersectedNode(LinkedListNode n1, LinkedListNode n2){
        if(n1 == null || n2 == null) return null;

        LinkedListNode a_pointer = n1;
        LinkedListNode b_pointer = n2;

        while(a_pointer != b_pointer){
            if(a_pointer == null){
                a_pointer = n2;
            } else {
                a_pointer = a_pointer.next;
            }

            if(b_pointer == null){
                b_pointer = n1;
            } else {
                b_pointer = b_pointer.next;
            }
        }
        return a_pointer;
    }


}
