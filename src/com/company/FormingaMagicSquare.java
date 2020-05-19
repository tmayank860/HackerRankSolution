package com.company;

public class FormingaMagicSquare {
    public static void main(String[] args) {
        int[][] s={{4,5,8},{2,4,1},{1,9,7}};
        System.out.println(formingMagicSquare(s));
    }
    static int formingMagicSquare(int[][] s) {
    int sum,cost=0;
    for (int i=0;i<3;i++){
        sum=0;
        for (int j=0;j<3;j++){
            sum=sum+s[i][j];
        }
        cost=cost+Math.abs(15-sum);
    }
return cost;
    }
}
