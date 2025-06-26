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
    
 public ListNode swapPairs(ListNode h) {
        ListNode d = new ListNode(0);
        d.next = h;
        ListNode c = d;
        while (c.next != null && c.next.next != null) {
            ListNode a = c.next;
            ListNode b = c.next.next;
            a.next = b.next;
            c.next = b;
            b.next = a;
            c = c.next.next;
        }
        return d.next;
 }}