package com.ammar.problem.solving.linkedlist.manipulation;

public class LinkedList {

    Node head = null;


    public <var> Node insert(var data) {
        Node node = new Node();
        node.value = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        return this.head;
    }

    public void show(Node node) {
        Node head = node;

        while (head.next != null) {
            System.out.println(head.value);
            head = head.next;
        }
        System.out.println(head.value);
    }

    public Node reverse(Node node){
        Node currNode = node;
        Node prevNode = null;
        Node nextNode = null;

        while(currNode!=null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;
    }

    public Boolean palindrome(Node headNode){
        /**
         *
         total number of value are in odd                   total number of value are in even
         ------------------------ while (fp!=null&&fp.next!=null) ---------------------------
         |1|2|4|5|6|                                        |1|2|4|5|
         | |s|f| | |                                        | |s|f| | |
         | | |s| |f|                                        | | |s| |f|
         | | | | | |                                        | | | | | |
         then, the mid will be                              then, the mid will be
         | | | | | |                                        | | | | | |
         | | | |M| |                                        | | |M| | |

         */

        Node slowPointer = headNode;
        Node fastPointer = headNode;
        Node midPoint = null;

        //finding mid+1
        while (fastPointer!=null&&fastPointer.next!=null){
           slowPointer = slowPointer.next;
           fastPointer = fastPointer.next.next;
        }

        //if odd number of value : fp is not null
        if (fastPointer!=null){
            midPoint = slowPointer.next;
        }else midPoint = slowPointer;

        Node reverse = reverse(midPoint);
        show(reverse);

        while (reverse!=null){
            if(headNode.value!=reverse.value)
                return false;
            reverse = reverse.next;
            headNode = headNode.next;
        }
            return true;
    }


}
