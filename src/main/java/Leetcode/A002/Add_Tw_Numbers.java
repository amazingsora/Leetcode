package Leetcode.A002;

//You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//        　　Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        　　Output: 7 -> 0 -> 8

import com.fasterxml.jackson.databind.node.ArrayNode;

import java.util.List;


public class Add_Tw_Numbers {
    public static void main(String[] args) {
        ListNode m1=new ListNode(2);
        m1.next=new ListNode(4);
        m1.next.next=new ListNode(3);

        ListNode m2=new ListNode(5);
        m2.next=new ListNode(6);
        m2.next.next=new ListNode(4);
        ListNode Sum= list(m1,m2);
        System.out.println("List:"+Sum.val+","+Sum.next.val+","+Sum.next.next.val);

    }

    static public ListNode list(ListNode mun1, ListNode mun2) {
        ListNode mun = new ListNode(0);
        int sum = 0;
        ListNode cur = mun;

        ListNode p1 = mun1, p2 = mun2;
        int count =0;
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }
            cur.next = new ListNode(sum % 10);
            sum /= 10;
            cur = cur.next;
        }


        if (sum == 1) {
            cur.next = new ListNode(1);
        }
        return mun.next;

    }


}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
