/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        int length = 1;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        k %= length;
        if (k == 0) return head;
        curr.next = head;
        int steps = length - k;
        while (steps > 0) {
            curr = curr.next;
            steps--;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        return newHead;
    }
}
