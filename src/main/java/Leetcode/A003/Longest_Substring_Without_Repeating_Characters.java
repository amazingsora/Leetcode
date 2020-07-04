package Leetcode.A003;

import java.util.LinkedHashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s="abc";
        int a=Q003(s);
        System.out.println("長度為:"+a);
    }
    static int Q003(String s){
        Set list= new LinkedHashSet();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        return list.size();

    }
}
