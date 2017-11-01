package com.jucongyuan.medium._0024;

import com.jucongyuan.data_structure.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(0);
        node.next = head;
        head = node;
        while (head.next != null && head.next.next != null) {
            ListNode temp = head.next.next.next;
            head.next.next.next = head.next;
            head.next = head.next.next;
            head.next.next.next = temp;
            head = head.next.next;
        }
        return node.next;
    }
}
