package com.careerit.learning.javaprogram;

public class FindLargestNumber {
    public static void main(String[] args) {
        int num1=100,num2=20,num3=30;
        if(num1>num2&&num1>num3) {
            System.out.println(num1 + " is largest number");
        }
        else if (num2>num3&&num2>num1) {
            System.out.println(num2+" is largest number");
        }
        else{
            System.out.println(num3+" is largest number");
        }
    }
}
