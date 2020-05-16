package com.company;

import java.util.Arrays;

public class BreakingtheRecords {
    public static void main(String[] args) {
        int[] arr={3 ,4 ,21 ,36 ,10 ,28 ,35 ,5,24,42};
        System.out.println(breakingRecords(arr));
        for (int i=0;i<arr.length;i++){


        }

    }
    static String breakingRecords(int[] scores) {
        int max=scores[0],min=scores[0];
        int[] count=new int[2];
        for (int i=0;i<scores.length;i++){
            if(scores[i]>max){
                max=scores[i];
                count[0]++;
            }
           else if (scores[i]<min){
                min=scores[i];
                count[1]++;
            }
        }
       return Arrays.toString(count);
    }
}
