package net.elvfab.problems;

import net.elvfab.utils.ListNode;

public class AddTwoNumbers {

    // Input: l1 = [2,4,3], l2 = [5,6,4]
    // Output: [7,0,8]
    // Explanation: 342 + 465 = 807.

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode();
        ListNode tail = head;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int res = (val1 + val2 + carry) % 10;

            if (val1 + val2 + carry >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }

            ListNode newNode = new ListNode(res);
            tail.next = newNode;
            tail = newNode;

            if (l1 != null ) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return head.next;
    }

    // all tests passed on leetcode
}
