package com.company.Strings;

public class PalindromePermutation {

    public boolean isPalindromePermutation(String s){
        s = s.replaceAll("\\s+","");
        int[] count = new int[128];
        int value = 0;
        int odd = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            value = s.charAt(i);
            count[value]++;
        }

        for(int k : count){
            if(k%2 != 0){
                odd++;
            }
        }

        return (s.length() % 2 == 0 && odd == 0) || (s.length() % 2 != 0 && odd == 1);
    }
}
