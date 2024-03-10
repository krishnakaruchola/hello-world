package com.careerit.learning.javaprogram;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int number=19;
        int num=number;
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
            System.out.println("Given number "+number+" is Prime Number");
        else
            System.out.println("Given number "+number+" is Not a Prime Number");
    }
}
