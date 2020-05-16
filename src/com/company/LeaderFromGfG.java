package com.company;

import java.util.Scanner;

public class LeaderFromGfG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            leaderinArray(arr, n);
//            leader(arr, n);
        }
    }

    //    Method 1
    public static void leaderinArray(int[] arr, int n) {
        System.out.println("--------------------------------------");
        System.out.println("Method 1");
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
            }
            if (j == n) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------");
    }
//    Method 2

    public static void leader(int[] arr, int n) {
        System.out.println("--------------------------------------");
        System.out.println("Method 2");
        int max = arr[n - 1];
        System.out.print(max + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >=max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------");
    }
}
