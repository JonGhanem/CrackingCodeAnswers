package com.company.Strings;

public class DuplicatedChar {
    public boolean isNotDuplicated(String w1){
        if(w1.length() > 128){
            return false;
        }
        int indexValue = 0;
        boolean[] arrayChar = new boolean[128];
        for(int i = 0 ; i < w1.length() ; i++){
            indexValue = w1.charAt(i);
            if(arrayChar[indexValue]){
                return false;
            }
            arrayChar[indexValue] = true;
        }
        return true;
    }
}
