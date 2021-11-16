package com.ammar.problem.solving.linkedlist;

import com.ammar.problem.solving.linkedlist.manipulation.Node;
import com.ammar.problem.solving.linkedlist.manipulation.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.insert('c');
        link.insert('i');
        link.insert('v');
        link.insert('i');
        Node n2 = link.insert('c');


        System.out.println(link.palindrome(n2));
    }
}
