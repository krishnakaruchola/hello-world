package com.careerit.learning.javaprogram;

public class CountNumberOfOccurancesOfACharacter {
    public static void main(String[] args) {
        String str = "welcome to java programming language tutorial";
        String str2=str;
        int totalLength=str.length();
        str2=str2.replaceAll("a","");
        int afterRemovingLenght=str2.length();
        int count=totalLength-afterRemovingLenght;
        System.out.println("Total Number of Occurance of Character 'a' is :"+count);
    }
}
