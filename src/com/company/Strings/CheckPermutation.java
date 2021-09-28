package com.company.Strings;

import java.util.Collections;

public class CheckPermutation {

    public boolean isPermuted(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        return sort(s1).equals(sort(s2));
    }

    private String sort(String s1){
       char[] chArray = s1.toCharArray();
       // Sorting Array off charters
       java.util.Arrays.sort(chArray);
       return new String(chArray);
    }
}
