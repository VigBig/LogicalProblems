package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class CouponNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Random Coupon Generator:");

        System.out.println("How many coupons do you want to generate?");
        int n = sc.nextInt();

        int[] coupons = new int[n];
        coupons = generateRandomCouponNumbers(coupons,n);
        coupons = checkDuplicates(coupons,n);
        printCoupons(coupons,n);

    }
        private static void printCoupons ( int[]coupons, int n){

            for (int l = 0; l < n; l++) {
                System.out.print(coupons[l] + " ");
            }

        }


        private static int[] checkDuplicates ( int[]coupons, int n){

            for (int j = (n - 1); j >= 0; j--) {

                for (int k = 0; k < n; k++) {

                    if (coupons[k] == coupons[j]) {
                        coupons[j] = (int) (Math.random() * 100) + 100;
                        continue;
                    }
                }

            }

            return coupons;
        }

        private static int[] generateRandomCouponNumbers (int[]coupons, int n){

            for (int i = 0; i < n; i++) {

                coupons[i] = (int) (Math.random() * 100) + 100;

            }
            return coupons;
        }

}

