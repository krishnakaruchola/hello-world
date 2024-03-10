package com.careerit.learning.javaprogram;

import java.util.Random;

public class RandomNumberGeneration {
    public static void main(String[] args) {
       Random rand  = new Random();
       int rand_int=rand.nextInt(100);
       System.out.println(rand_int);

       Double db = rand.nextDouble();
       System.out.println(db);

       System.out.println(Math.random());
    }
}
