package com.jucongyuan.hard._0025;

import com.jucongyuan.data_structure.ListNode;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;
        int count = 0;
        while (node != null && count != k) {
            node = node.next;
            count++;
        }

        if (count == k) {
            node = reverseKGroup(node, k);
            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = node;
                node = head;
                head = temp;
            }
            head = node;
        }

        return head;
    }
}
