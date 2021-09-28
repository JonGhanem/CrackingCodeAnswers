package com.company.Strings;

public class StringCompression {

    public String compressString(String s){
        int count = 1;
        StringBuilder sBuilder = new StringBuilder();
        for(int i = 1; i < s.length() ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
                if(i+1 >= s.length()){
                    sBuilder.append(s.charAt(i-1));
                    sBuilder.append(count);
                }
            } else {
                sBuilder.append(s.charAt(i-1));
                sBuilder.append(count);
                count = 1;
                if(i+1 >= s.length()){
                    sBuilder.append(s.charAt(i));
                    sBuilder.append(count);
                }
            }
        }
        return sBuilder.toString();
    }
}
