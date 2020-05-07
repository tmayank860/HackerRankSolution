package com.company;
import java.io.*;
import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            b[i]=sc.nextInt();
        }
        int[] r=new int[2];
        r[0]=0;
        r[1]=0;
        for(int i=0;i<3;i++){
            if(a[i]>b[i]){
                r[0]=r[0]+1;
            }
            else if(b[i]>a[i]){
                r[1]=r[1]+1;
            }else{
                r[0]=r[0]+0;
                r[1]=r[1]+0;
            }
        }
        for(int i=0;i<2;i++){
            System.out.print(r[i]+" ");
        }

    }
}
