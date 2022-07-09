package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simulating StopWatch Program:");

        char c = ' ';

        System.out.println("Enter 's' to start the stop watch : ");
        c = sc.next().charAt(0);


        long startTime = 0, endTime = 0;

        if (c == 's' || c == 'S') {
            System.out.println("Stop watch started");

            startTime = System.currentTimeMillis();

            System.out.println("Enter 'e' to end the stop watch : ");
            c = sc.next().charAt(0);

            if (c == 'e' || c == 'E') {
                System.out.println("Stop watch ended");

                endTime = System.currentTimeMillis();

                long timeDifference = endTime - startTime;

                int hours = (int) timeDifference / (1000 * 60 * 60);
                int minutes = (int) timeDifference / (1000 * 60);
                int seconds = (int) timeDifference / 1000;
                int milliSeconds = (int) timeDifference % 1000;

                System.out.println(timeDifference+" milliseconds has passed OR");

                System.out.println(hours + ":" + minutes + ":" + seconds + ":" + milliSeconds+" have passed.");
            } else {
                System.out.println("ERROR! Invalid input");
            }
        } else {
            System.out.println("ERROR! Invalid input");
        }

        sc.close();
    }
}
