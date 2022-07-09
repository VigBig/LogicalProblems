package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumOfFactors = 0;

        System.out.println("Enter number:");
        int num = sc.nextInt();

        System.out.println("Factors of " + num + " apart from "+ num +" are :");
        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                System.out.print(i+" ");
                sumOfFactors =  i+ sumOfFactors;
            }

        }

        System.out.println();

        if(sumOfFactors == num){
            System.out.println(num + " is a perfect number");
        }else {
            System.out.println(num + " is not a perfect number");
        }


    }
}
