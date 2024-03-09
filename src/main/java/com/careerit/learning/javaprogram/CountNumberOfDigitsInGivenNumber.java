package com.careerit.learning.javaprogram;

public class CountNumberOfDigitsInGivenNumber {
    public static void main(String[] args) {
        int number=123456789;
        int num=number;
        int count=0;
        int rem;
        while(num>0)
        {
            num=num/10;
            count=count+1;
        }
        System.out.println("Number of digits in given number "+number+" is "+count);
    }

}
