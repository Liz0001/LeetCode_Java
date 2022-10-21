package com.liu0001.Convert_Binary_Number_in_a_Linked_List_to_Integer_1290;

/*
1290. Convert Binary Number in a Linked List to Integer

Given head which is a reference node to a singly-linked list.
The value of each node in the linked list is either 0 or 1.
The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(0);


        listNode1.next = listNode2;
        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;


        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);


        int ans1 = solution.getDecimalValue(listNode1);
        System.out.println("\nAnswer: "+ans1);

        int ans2 = solution.getDecimalValue(node1);
        System.out.println("\nAnswer: "+ans2);

        int ans3 = solution.getDecimalValue(node2);
        System.out.println("\nAnswer: "+ans3);

    }
}
