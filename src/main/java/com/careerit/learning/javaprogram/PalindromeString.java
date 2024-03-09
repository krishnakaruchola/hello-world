package com.careerit.learning.javaprogram;

public class PalindromeString {
    public static void main(String[] args) {
        String str="madam";
        String temp=str;
        String reverse="";

        for (int i=str.length()-1;i>=0;i--)
        {
            reverse = reverse+str.charAt(i);
        }
        if(temp.equals(reverse))
            System.out.println("Given String "+str+" is a Palindrome String");
        else
            System.out.println("Given String "+str+" is Not a Palindrome String");
    }
}
