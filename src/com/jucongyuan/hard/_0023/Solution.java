package com.jucongyuan.hard._0023;

import com.jucongyuan.data_structure.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });


        for (ListNode listNode : lists) {
            if (listNode != null)
                queue.offer(listNode);
        }

        ListNode head = new ListNode(0);
        ListNode p = head;


        while (!queue.isEmpty()) {
            ListNode n = queue.poll();
            p.next = n;
            p = p.next;

            if (n.next != null)
                queue.offer(n.next);
        }

        return head.next;
    }
}
