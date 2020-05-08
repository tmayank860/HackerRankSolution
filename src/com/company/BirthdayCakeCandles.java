package com.company;

import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(numberOfCandles(arr,n));
    }

//    Method 1
    public static int numberOfCandles(int arr[],int n){
        int max=arr[0],count=0;
        for (int i=0;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for (int i=0;i<n;i++){
            if (max==arr[i]){
                count++;
            }
        }
        return count;
    }
}
