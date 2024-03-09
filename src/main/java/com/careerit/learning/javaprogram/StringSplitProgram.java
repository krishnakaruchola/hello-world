package com.careerit.learning.javaprogram;

public class StringSplitProgram {

    public static void main(String[]args){

        String str="java,selenium,testng,maven,jenkins";
        String  arr[] =str.split(",");
        for (String words:arr)
        {
            System.out.println(words);
        }
    }
}
