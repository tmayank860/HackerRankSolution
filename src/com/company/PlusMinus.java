package com.company;
import java.util.*;



public class PlusMinus {

        // Complete the plusMinus function below.
        static void plusMinus(int[] arr) {
            int c1=0,c2=0,c3=0;
            int n=arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]>0){
                    c1=c1+1;
                }
                else if(arr[i]<0){
                    c2=c2+1;
                }
                else{
                    c3=c3+1;
                }
            }
            double x=(double)c1/n;
            double y=(double)c2/n;
            double z=(double)c3/n;
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);


        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            plusMinus(arr);

            scanner.close();
        }
    }


