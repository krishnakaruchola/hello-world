package com.careerit.learning.javaprogram;

public class FibonocciSeries {
    public static void main(String[] args) {
        int num=10,num3;
        int num1=0,num2=1;
        System.out.print(num1+" "+num2);
        for(int i=2;i<num;i++)
        {
        num3=num1+num2;
        num1=num2;
        num2=num3;
        System.out.print(" "+num3);
        }
    }
}
