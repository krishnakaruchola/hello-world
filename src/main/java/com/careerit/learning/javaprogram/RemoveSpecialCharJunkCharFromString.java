package com.careerit.learning.javaprogram;

public class RemoveSpecialCharJunkCharFromString {
    public static void main(String[] args) {
        String str = "!@#$%^& welcome to Java programming!@#$%^&*(";
        String str2 = "@@@@@@@@@@@@ %%%%%%%%%%% ********** selenium Java+++++Y&()__(&&^^%$$";

       str=str.replaceAll("[^a-zA-Z0-9]","");
       str2=str2.replaceAll("[^a-zA-Z0-9]","");
       System.out.println(str);
       System.out.println(str2);
    }
}
