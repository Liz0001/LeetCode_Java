package com.liu0001.Defanging_an_IP_Address_1108;

/*
* 1108. Defanging an IP Address from Leetcode.
*
* Given a valid (IPv4) IP address, return a defanged
* version of that IP address.

A defanged IP address replaces every period "." with "[.]".
* */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String address = "1.1.1.1";     // Output: "1[.]1[.]1[.]1"
        String newAddress = solution.defangIPaddr(address);
        System.out.println(newAddress);
    }
}


class Solution {
    public String defangIPaddr(String address) {

        String[] parts = address.split("\\.");
        return parts[0] + "[.]" + parts[1] + "[.]" + parts[2] + "[.]" + parts[3];
    }
}