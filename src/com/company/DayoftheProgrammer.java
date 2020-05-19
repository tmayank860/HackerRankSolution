package com.company;

public class DayoftheProgrammer {
    public static void main(String[] args) {
System.out.println(dayOfProgrammer(2019));
    }
    static String dayOfProgrammer(int year) {
        String str=".09."+Integer.toString(year);
        if(year==1918){
            return "26"+str;
        }
        if((year<=1917&&year%4==0)||(year>1918)&&((year%400==0)||(year%4==0&&year%100!=0))){
            return "12"+str;
        }else{
            return "13"+str;
        }

    }
}
