package com.careerit.learning.javaprogram;

public class FindingDuplicateWordsCount {
    public static void main(String[] args) {
        String str="This is one String, which one need to be tested for duplicate word";
        String []brokenString=str.trim().split(" ");
        int count=1;
        for(int i=0;i<brokenString.length;i++)
        {
            for(int j=i+1;j<brokenString.length;j++)
            {
                if(brokenString[i].equals(brokenString[j]))
                {
                    count=count+1;
                    brokenString[j]="0";
                }
            }
            if(count>1)
            {
                System.out.println(brokenString[i]+" is repeated "+count+" times");
                count=1;
            }
        }
    }
}
