package com.liu0001.Design_an_Ordered_Stream_1656;

/*
1656. Design an Ordered Stream.
There is a stream of n (idKey, value) pairs arriving in an arbitrary order,
where idKey is an integer between 1 and n and value is a string.
No two pairs have the same id.

Design a stream that returns the values in increasing order of their
IDs by returning a chunk (list) of values after each insertion.
The concatenation of all the chunks should result in a list of the sorted values.

Implement the OrderedStream class:

OrderedStream(int n) Constructs the stream to take n values.
String[] insert(int idKey, String value) Inserts the pair
(idKey, value) into the stream, then returns the largest possible
chunk of currently inserted values that appear next in the order.
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {

        OrderedStream os = new OrderedStream(5);

        List<String> ans1 = os.insert(3, "ccccc"); // Inserts (3, "ccccc"), returns [].
        System.out.println(ans1);

        List<String> ans2 = os.insert(1, "aaaaa"); // Inserts (1, "aaaaa"), returns ["aaaaa"].
        System.out.println(ans2);

        List<String> ans3 = os.insert(2, "bbbbb"); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        System.out.println(ans3);

        List<String> ans4 = os.insert(5, "eeeee"); // Inserts (5, "eeeee"), returns [].
        System.out.println(ans4);

        List<String> ans5 = os.insert(4, "ddddd"); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
        System.out.println(ans5);


    }
}

