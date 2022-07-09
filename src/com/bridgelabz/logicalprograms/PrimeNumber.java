package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;

        System.out.println("Enter number:");
        int num = sc.nextInt();

        for (int i = 1; i <=num; i++) {

                if (num% i == 0) {
                    counter++;
                }

        }

        if(counter == 2){
            System.out.println(num+" is a Prime Number");
        }else{
            System.out.println(num+" is not a Prime Number");
        }


    }

}
