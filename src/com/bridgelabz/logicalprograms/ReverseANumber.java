package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rev = 0;
        int rem = 0;

        System.out.println("Enter number:");
        int num = sc.nextInt();

        System.out.print("The reverse of "+num+" is :");

        while(num!=0){
            rem = num%10;
            num = num/10;

            rev = rem + rev*10;
        }

        System.out.print(" "+rev);

    }
}
