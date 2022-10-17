package com.liu0001.Convert_Binary_Number_in_a_Linked_List_to_Integer_1290;

public class Solution {
    static int index = 1;

    public int getDecimalValue(ListNode head) {
        int num = head.val;
        int val = 0;
        if (head.next != null) {
            val = getDecimalValue(head.next);
        }

        index  = index*2;
        if (num == 0) {
            return val;
        }

        return (index + head.val);
    }
}
