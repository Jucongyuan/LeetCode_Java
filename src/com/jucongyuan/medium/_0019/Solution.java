package com.jucongyuan.medium._0019;

import com.jucongyuan.data_structure.ListNode;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
