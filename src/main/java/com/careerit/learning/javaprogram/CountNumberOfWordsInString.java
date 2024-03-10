package com.careerit.learning.javaprogram;

public class CountNumberOfWordsInString {
    public static void main(String[] args) {
        String str = "welcome to java programming language using Intellij Idea";
        String arr[]=str.trim().split("\\s");
        int count=0;
        for(String data:arr) {
            count++;
        }
        System.out.println("Number of words in given string is: "+count);
    }
}
