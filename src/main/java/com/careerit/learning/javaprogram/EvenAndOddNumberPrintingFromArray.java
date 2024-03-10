package com.careerit.learning.javaprogram;

public class EvenAndOddNumberPrintingFromArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Even Numbers in given Array are ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd Numbers in given Array are ");
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]%2!=0)
            {
                System.out.println(arr[j]);
            }
        }
    }
}
