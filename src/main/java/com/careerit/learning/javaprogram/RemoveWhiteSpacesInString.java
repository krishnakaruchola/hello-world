package com.careerit.learning.javaprogram;

public class RemoveWhiteSpacesInString {
    public static void main(String[] args) {
        String s = "welcome         to            java    programming using selenium webdriver";
        String arr[]=s.trim().split("\\s");
        System.out.print("Before Removing White Spaces String is :"+s);
        System.out.println("");
        System.out.print("After Removing White Spaces String is:");
        for(String data:arr)
            System.out.print(data);
    }
}
