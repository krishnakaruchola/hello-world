package com.careerit.learning.javaprogram;

public class ReverseStringProgram {

//  Input String: “This is the string to reverse"
// Final Output: “esrever ot gnirts eht si sihT”
    public static void main(String[] args) {
        //Approach 1
        String str = "This is the string to reverse";
        StringBuilder sb= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
