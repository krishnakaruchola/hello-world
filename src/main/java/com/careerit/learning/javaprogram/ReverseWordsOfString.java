package com.careerit.learning.javaprogram;

public class ReverseWordsOfString {
//    Input String: “This is the string to reverse”
//    Output String: “reverse to string the is This”
    public static void main(String[] args) {
        String str="This is the string to reverse";
        String []arr=str.trim().split("\\s");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
            sb.append(' ');
        }
        System.out.println(sb.toString());
    }
}
