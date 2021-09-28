package com.company.Strings;

public class ReplaceSpacesOfString {

    public String replaceStringSpace(String s){
        char[] sChar = s.toCharArray();
        char[] sec = new char[s.length()];
        int j = 0;
        for (char c : sChar) {
            if (j >= sChar.length) {
                break;
            }
            if (c == ' ') {
                sec[j] = '%';
                sec[j + 1] = '2';
                sec[j + 2] = '0';
                j += 3;
            } else {
                sec[j] = c;
                j++;
            }
        }
        return new String(sec);
    }
}
