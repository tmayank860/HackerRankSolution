package com.company;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<Integer>();
        ls.add(73);
        ls.add(67);
        ls.add(38);
        ls.add(33);
        List<Integer> l=gradingStudents(ls);
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> ls=new ArrayList<Integer>();
        for (int i=0;i<grades.size();i++){
            int x=grades.get(i);
             if((x+5-x%5)-x<3&&x>=38){
                ls.add(x+5-x%5);
            }else {
                ls.add(x);
            }
        }
return ls;
    }

}
