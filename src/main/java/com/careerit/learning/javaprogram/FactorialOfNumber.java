package com.careerit.learning.javaprogram;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int fact=1;
        int num=6;
        for(int i=1;i<=num;i++)
            fact=fact*i;
        System.out.println("Factorial of given number "+num+" ="+fact);
    }
}
