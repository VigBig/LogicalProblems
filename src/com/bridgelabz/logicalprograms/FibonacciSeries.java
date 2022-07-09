package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fibonacci Series :");

        System.out.println("Enter number of terms of the series to be displayed:");
        int n = sc.nextInt();

        int[] fib = new int[n];

        if(n==1){
            fib[0]= 0;
        }
        else{
            fib[1] = 1;
            for(int i =2; i<n; i++){
                fib[i]= fib[i-1] + fib[i-2];
            }

        }
        System.out.println("Printing Fibonacci Series of " +n+" terms:");
        for(int i =0; i<n; i++){
            System.out.print(fib[i]+" ");
        }

    }
}
