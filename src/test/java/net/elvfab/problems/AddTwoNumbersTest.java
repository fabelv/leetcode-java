package net.elvfab.problems;

import org.junit.jupiter.api.Test;
import net.elvfab.utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    // Copy of ListNode.fromArray for testing
    private ListNode fromArray(int[] digits) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int d : digits) {
            current.next = new ListNode(d);
            current = current.next;
        }
        return dummy.next;
    }

    // Copy of ListNode.toArray for testing
    private int[] toArray(ListNode node) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void addTwoNumbersExample() {
        // Input: 342 + 465 = 807
        ListNode l1 = fromArray(new int[]{2, 4, 3}); // 342
        ListNode l2 = fromArray(new int[]{5, 6, 4}); // 465

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);

        assertArrayEquals(new int[]{7, 0, 8}, toArray(result)); // 807
    }
}