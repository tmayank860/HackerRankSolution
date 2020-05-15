package com.company;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(4);
        List<Integer> b=new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);
        System.out.println(getTotalX(a,b));

        int t=1,no=62;
        while(t-->0){
            long sum=0;
            int j=0,i=2;
            while (j++<no){
                sum+=Math.pow(i,2);
                i+=2;
            }
            System.out.println(sum);
        }


    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here

        int count = 0, current_factor = a.get(a.size() - 1), flag;
        while (current_factor <= b.get(0)) {
            flag = 0;
            for (int i = 0; i < a.size(); i++) {
                if (current_factor % a.get(i) != 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                for (int i = 0; i < b.size(); i++) {
                    if (b.get(i) % current_factor != 0) {
                        flag = 1;
                        break;
                    }
                }

            }
            if (flag == 0) {
                count++;
            }
            current_factor++;
        }
        return count;
    }
}
