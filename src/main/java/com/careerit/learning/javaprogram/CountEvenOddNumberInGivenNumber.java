package com.careerit.learning.javaprogram;

public class CountEvenOddNumberInGivenNumber {
    public static void main(String[] args) {
        int number=123456;
        int evenCount=0,oddCount=0;
        int num=number;
        int rem;
        while(num>0)
        {
            rem=num%10;
            if(rem%2==0)
                evenCount++;
            else
                oddCount++;
            num=num/10;
        }
        System.out.println("Even Number Count ="+evenCount+" Odd Number Count ="+oddCount);
    }
}
