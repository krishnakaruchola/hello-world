package com.careerit.learning.javaprogram;

public class ReverseStringUsingStringFunctions {
    public static void main(String[] args) {
        String str="i am learning git and java interview programs";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}
