package com.company.Strings;

public class StringRotation {
    public boolean isStringRotated(String s1, String s2){
       return (s1.length() == s2.length() && s1.length() > 0 && (s1+s1).contains(s2));
    }
}
