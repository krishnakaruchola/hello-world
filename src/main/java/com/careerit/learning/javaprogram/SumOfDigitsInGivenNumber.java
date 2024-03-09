package com.careerit.learning.javaprogram;

public class SumOfDigitsInGivenNumber {
    public static void main(String[] args) {
        int number=123456789;
        int num=number;
        int sum=0,rem;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of digits in given number "+number+" = "+sum);
    }
}
