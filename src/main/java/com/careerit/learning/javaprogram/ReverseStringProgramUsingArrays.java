package com.careerit.learning.javaprogram;

public class ReverseStringProgramUsingArrays {
    public static void main(String[] args) {

        String str = "i am krishnakanth";
        char stringToCharArray[] = str.toLowerCase().toCharArray();
        String rev="";
        for (int i=stringToCharArray.length-1;i>=0;i--)
        {
            rev=rev+stringToCharArray[i];
        }
        System.out.println(rev);
    }
}
