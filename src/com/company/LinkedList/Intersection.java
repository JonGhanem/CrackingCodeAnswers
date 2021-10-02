package com.company.LinkedList;

import java.util.HashSet;

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


}
