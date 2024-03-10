package com.careerit.learning.javaprogram;

public class MaxAndMinElementInArray {
    public static void main(String[] args) {
        int arr[]={10,2,300,4,50};
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum Element in Array is "+min);

        int max=arr[0];
        for(int j=1;j<arr.length;j++)
        {
            if(max<arr[j])
            {
                max=arr[j];
            }
        }
        System.out.println("Maximum Element in Array is "+max);
    }
}
