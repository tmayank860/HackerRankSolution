package com.company;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {
    public static void main(String[] args) {
        List<Integer> ls =new ArrayList<>();
        ls.add(4);
//        ls.add(2);
//        ls.add(1);
//        ls.add(3);
//        ls.add(2);
        System.out.println(birthday(ls,4,1));

    }

    static int birthday(List<Integer> s, int d, int m) {
        int count=0;
        for (int i=0;i<=s.size()-m;i++){
            int sum=0,temp=0;
            while (temp<m){
                sum=sum+s.get(i+temp);
                temp++;
            }
            if (sum==d){
                count++;
            }
        }
return count;
    }
}
