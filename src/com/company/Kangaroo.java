package com.company;

public class Kangaroo {
    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v2 >= v1 && x1 != x2) {

            return "NO";

        } else {

            if ((x2 - x1) % (v2 - v1) == 0)
                return "YES";
            else
                return "NO";

        }
    }
}
