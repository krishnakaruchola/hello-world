package com.careerit.learning.javaprogram;

import java.util.Arrays;

public class ArraysAreEqualOrNotUsingArrayFunction {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        int a2[]={1,2,3,4,5};
        int len1=a1.length;
        int len2=a2.length;
     boolean status ;
     if(len1==len2)
     {
         status = Arrays.equals(a1,a2);
         if(status==true)
             System.out.println("Two Arrays are Equal");
         else
             System.out.println("Two Arrays are Not Equal");
     }
    }
}
