package com.careerit.learning.javaprogram;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1=10,num2=20;
        int temp;
        System.out.println("Before Swap values of num1 "+"and num2 "+"are = "+num1+" "+num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swap values of num1"+" and num2 "+"are = "+num1+" "+num2);
    }
}
