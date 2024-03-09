package com.careerit.learning.javaprogram;

public class PalindomeNumber {
    public static void main(String[] args) {
        int number=16461;
        int num=number;
        int rem,rev=0;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==number)
            System.out.println("Given number "+number+" is a Palindrome Number");
        else
            System.out.println("Given number "+number+" is Not a Palindrome Number");
    }
}
