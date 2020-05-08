package com.company;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int lefttoright=0;
        int righttoleft=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j){
                    lefttoright+=arr[i][j];
                }
                if (i+j==n-1){
                    righttoleft+=arr[i][j];
                }
            }
        }
        int diff=Math.abs(lefttoright-righttoleft);
        System.out.println(diff);
    }
}
