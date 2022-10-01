package com.liu0001.Design_an_Ordered_Stream_1656;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class OrderedStream {
    private int pointer;
    private String[] ans;


    public OrderedStream(int n) {
        this.pointer = 0;
        this.ans = new String[n];
    }

    public List<String> insert(int key, String val) {
        key--;
        List<String> send = new ArrayList<>();

        this.ans[key] = val;

        if (pointer == key) {
            for (int i = pointer; i < ans.length; i++) {
                if (ans[i] == null) {
                    pointer = i;
                    return send;
                }
                send.add(ans[i]);
            }
        }
        else {
            return Arrays.asList(new String[0]);
        }
        return send;
    }
}