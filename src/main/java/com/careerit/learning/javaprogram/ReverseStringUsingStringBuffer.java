package com.careerit.learning.javaprogram;

public class ReverseStringUsingStringBuffer {
    public static void main(String[] args) {
        String str="Welcome to Java learning sessions";
        StringBuffer sb= new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
