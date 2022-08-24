package com.liu0001.Merge_Two_Sorted_Lists_21;

/*21. Merge Two Sorted Lists from Leetcode.

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list.
The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
*/

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode ans = solution.mergeTwoLists(listNode1, listNode4);
        System.out.println(ans);

    }
//  Input: list1 = [1,2,4], list2 = [1,3,4]
//  Output: [1,1,2,3,4,4]
}
