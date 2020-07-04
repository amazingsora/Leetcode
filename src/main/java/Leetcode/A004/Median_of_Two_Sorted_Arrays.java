package Leetcode.A004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int a[]={1,1};
        int b[]={2};
        System.out.println("中位數"+Q4(a,b));
    }


     static public double Q4(int[]mun1,int[]mun2){
        int q=0;
        List<Integer>list=new ArrayList();
        for (int i = 0; i < mun1.length ; i++) {
            list.add(mun1[i]);
        }
        for (int i = 0; i <mun2.length ; i++) {
            list.add(mun2[i]);

        }
         Collections.sort(list);
         System.out.println("長度:"+list.size());
         Iterator<Integer> iterator = list.iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }

         int listlength=list.size();
        if (listlength%2==0&&listlength!=1){
            int a =list.get(listlength/2);
            int b=list.get((listlength/2)-1);
            double c=(double) (a+b)/2;

            return c;
        }
        else {
            double a =listlength/2;
            Math.round(a);
            System.out.println("基數:"+a);

            return list.get((int) a);
        }


    }
}
