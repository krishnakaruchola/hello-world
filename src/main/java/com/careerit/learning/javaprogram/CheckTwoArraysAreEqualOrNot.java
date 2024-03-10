package com.careerit.learning.javaprogram;

public class CheckTwoArraysAreEqualOrNot {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,6,5};
        boolean status=true;
        int len1=arr1.length;
        int len2=arr2.length;
       if(len1==len2)
       {
           for(int i=0;i<len2;i++)
           {
               if(arr1[i]!=arr2[i])
               {
                   status=false;
               }
           }
           if(status==true)
               System.out.println("Two Arrays are Equal");
           else
               System.out.println("Two Arrays are Not Equal");
       }
       else
           status=false;

    }
}
