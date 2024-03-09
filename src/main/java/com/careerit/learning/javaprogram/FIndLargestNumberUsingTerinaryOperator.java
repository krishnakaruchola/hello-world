package com.careerit.learning.javaprogram;

public class FIndLargestNumberUsingTerinaryOperator {
    public static void main(String[] args) {
        int num1=10,num2=20,num3=30,largest1,largest;
        largest1=num1>num2?num1:num2;
        largest=largest1>num3?largest1:num3;
        System.out.println(largest+ " is largest number");
    }
}
