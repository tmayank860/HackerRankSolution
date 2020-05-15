 package com.company;

public class TimeConversion {
    public static void main(String[] args) {
        String s="12:45:45PM";
        System.out.println(timeConversion(s));
    }

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String str="";
        if(!s.substring(0,2).equals("12")&&s.contains("PM")){
            str= Integer.toString(Integer.parseInt(s.substring(0,2))+12);
            s =str+s.substring(2,s.length());
        }
        if(s.substring(0,2).equals("12")&&s.contains("AM")){
            str="00";
            s =str+s.substring(2,s.length());
        }
        return s.substring(0,s.length()-2);
    }
}
