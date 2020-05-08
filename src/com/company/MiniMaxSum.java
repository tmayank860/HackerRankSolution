package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        miniMax(arr);
        minMaxSum(arr);
    }

    public static void miniMax(int[] arr){
        int n=arr.length, min=arr[0],max=arr[0];
        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println((sum-max)+" "+(sum-min));
    }

//    Method 2

    public static void minMaxSum(int[] arr){
        Arrays.sort(arr);
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println((sum-arr[arr.length-1])+" "+(sum-arr[0]));
    }
}
