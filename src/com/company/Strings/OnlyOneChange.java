package com.company.Strings;

public class OnlyOneChange {
    public boolean isOneChange(String s1, String s2){
        int difference = s1.length() - s2.length();
        if(difference > 1 || difference < -1){
            return false;
        }

        if(difference == 0){
            return replacement(s1, s2);
        } else {
           return insertOrDelete(s1, s2);
        }
    }

    private boolean insertOrDelete(String s1, String s2) {
        int index1 = 0, index2 = 0;
         while(index1 < s1.length() && index2 < s2.length()){
             if(s1.charAt(index1) != s2.charAt(index2)){
                 if(index1 != index2){
                     return false;
                 }
                 index2++;
             } else {
                 index1++;
                 index2++;
             }
         }
         return true;
    }

    private boolean replacement(String s1, String s2) {
        boolean countChanges = false ;
        for(int i = 0; i < s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(countChanges){
                    return false;
                }
                countChanges = true;
            }
        }
        return true;
    }

}
