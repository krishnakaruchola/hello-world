package com.careerit.learning.javaprogram;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str = "welcome to java programming";
        String []words=str.trim().split("\\s");
        String reverseString="";
        for(String w:words)
        {
            String reverseWord="";
            for(int i=w.length()-1;i>=0;i--)
            {
                reverseWord=reverseWord+w.charAt(i);
            }
            reverseString=reverseString+reverseWord+" ";
        }
        System.out.println(reverseString);
    }
}
