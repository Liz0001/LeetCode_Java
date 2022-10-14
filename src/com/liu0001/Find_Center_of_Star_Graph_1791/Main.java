package com.liu0001.Find_Center_of_Star_Graph_1791;

/*
1791. Find Center of Star Graph

There is an undirected star graph consisting of n nodes labeled
from 1 to n. A star graph is a graph where there is one center
node and exactly n - 1 edges that connect the center node with every other node.

You are given a 2D integer array edges where each edges[i] = [ui, vi]
indicates that there is an edge between the nodes ui and vi.
Return the center of the given star graph.
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        int[][] edges = {{1,2},{2,3},{4,2}};
        int[][] edges = {{1,2},{5,1},{1,3},{1,4}};
        int ans = sol.findCenter(edges);
        System.out.println(ans);
    }
}


class Solution {
    public int findCenter(int[][] edges) {
        int node = edges[0][0];
        for (int i = 0; i < edges.length; i++) {
            if (node != edges[i][0] && node != edges[i][1]) {
                return edges[0][1];
            }
        }
        return node;
    }
}