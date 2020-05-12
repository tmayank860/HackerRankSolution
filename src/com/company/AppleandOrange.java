package com.company;

public class AppleandOrange {
    public static void main(String[] args) {
        int[] apples = {-2};
        int[] oranges = {1};
        countApplesAndOranges(2, 3, 1, 5, apples, oranges);

    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int apple = 0, orange = 0;
        for (int i = 0; i < apples.length; i++) {
            int pos = a + apples[i];
            if (pos >= s && pos <= t) {
                apple++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            int pos = b + oranges[i];
            if (pos >= s && pos <= t) {
                orange++;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
    }

}
