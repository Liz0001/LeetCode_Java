package com.liu0001.Merge_Two_Sorted_Lists_21;

// Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}

     ListNode(int val) {
         this.val = val;
     }

     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }

    @Override
    public String toString() {
        return  val + " " + next;
    }
}
