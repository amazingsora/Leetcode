package Leetcode.A001;


//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//        You may assume that each input would have exactly one solution.
//
//
//        Example:
//
//        Given nums = [2, 7, 11, 15], target = 9,
//
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Two_Sum {
    static public List<String> sum(int[] muns, int target) {
        int size = muns.length;
        List list = new LinkedList();
        for (int i = 0; i < size; i++) {
            for (int i2 = i + 1; i2 < size; i2++) {
                if (muns[i] + muns[i2] == target) {
                    list = Arrays.asList(i, i2);
                    return list;
                }

            }
        }
        return list;
    }
    static public void Q1(int[] muns, int target) {
        List list = sum(muns, target);
        if (list.size() > 1) {
            Iterator iterator = list.iterator();
            int i = 1;
            while (iterator.hasNext()) {
                System.out.println("第" + i + "個數為：" + iterator.next());
                i++;
            }
        } else
            System.out.println("並未找到符合之組合");
    }


}
