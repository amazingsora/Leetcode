package Leetcode.A005;

import java.util.LinkedList;
import java.util.List;

public class Longest_Palindromic_Substring {

    public static String Q5(String s){
       if (s==null||s.length()==0)
           return s;
        System.out.println("開始");
       String a=s;
        for (int i = 0; i <s.length()-1 ; i++) {
            int ii=i;
            for (int j =i+1 ; j <s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    System.out.println("發現重複");
                    if(i==0){
                       ii=1;
                    }
                    a=s.substring(0,j);
                    s=a;
                    System.out.println("此刻字串為:"+a);
                }
            }
            }
        return a;


    }

}
