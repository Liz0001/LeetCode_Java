package com.liu0001.Convert_Binary_Number_in_a_Linked_List_to_Integer_1290;

public class Solution {
    static int index = 1;

    public int getDecimalValue(ListNode head) {
        int num = head.val;
        int val = 0;
        int nr;

        if (head.next != null) {
            val = getDecimalValue(head.next);
        }
        if (head.next == null) index = 1;
        if (index == 1) {
            nr = head.val;
        } else {
            nr = val + num*index;
        }
        index = index + index;

        return nr;
    }
}
