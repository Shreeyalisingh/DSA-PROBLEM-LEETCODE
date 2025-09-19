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

    public  ListNode MidNode(ListNode head)
    {
         ListNode slow = head ;
         ListNode fast = head.next;
         ListNode mid ;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next ;
        }
        mid = slow;
        return mid;

    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

         ListNode middle = MidNode(head);

    //reverse LL
     ListNode rHead ;
     ListNode lHead ;
     ListNode prev = null;
     ListNode curr = middle.next ;
     ListNode next ;
    while(curr != null)
    {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    rHead = prev;
    middle.next = null;
    lHead = head;
      ListNode rNext;
       ListNode lNext;
 while(lHead != null && rHead != null)
 {   
     rNext = rHead.next;
   lNext = lHead.next;

    rHead.next = lNext ;
    lHead.next = rHead;

    rHead = rNext;
    lHead = lNext;

 }







        
    }
}