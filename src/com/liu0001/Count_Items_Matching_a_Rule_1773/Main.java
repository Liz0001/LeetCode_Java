package com.liu0001.Count_Items_Matching_a_Rule_1773;

/*
1773. Count Items Matching a Rule

You are given an array items, where each
items[i] = [typei, colori, namei] describes the type, color,
and name of the ith item. You are also given a rule represented by two strings,
ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        List<List<String>> items = new ArrayList<List<String>>() {};
        List<String> l1 = Arrays.asList("phone", "blue", "pixel");
        List<String> l2 = Arrays.asList("computer", "silver", "phone");
        List<String> l3 = Arrays.asList("phone", "gold", "iphone");
                                        // type,  color,  name
        items.add(l1);
        items.add(l2);
        items.add(l3);
        String ruleKey = "type";
        String ruleValue = "phone";
        int ans = solution.countMatches(items, ruleKey, ruleValue);
        System.out.println(ans);

    }

}


class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++ ) {
            if (ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))) {
                count++;
            } else if (ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))) {
                count++;
            } else if (ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))) {
                count++;
            }
        }
        return count;
    }
}