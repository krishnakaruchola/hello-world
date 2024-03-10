package com.careerit.learning.javaprogram;

public class ReverseGivenNumber {

    public static void main(String[] args) {
        int number=12345;
        int num=number;
        int rem,rev=0;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of given number "+number+" is "+rev);
    }
}
