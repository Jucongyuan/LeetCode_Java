package com.jucongyuan.medium._002;

import com.jucongyuan.data_structure.ListNode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int sum = 0;
        int carry = 0;
        ListNode newNode;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                if (l1 != null) {
                    sum = l1.val + carry;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum = l2.val + carry;
                    l2 = l2.next;
                }
            }
            newNode = new ListNode(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;
        }

        if (carry != 0) {
            newNode = new ListNode(carry);
            curr.next = newNode;
        }
        return dummy.next;
    }
}
