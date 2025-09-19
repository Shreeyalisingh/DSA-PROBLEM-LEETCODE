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
    public boolean isPalindrome(ListNode head) {

        List<Integer> ll = new ArrayList<>();
        
        ListNode nn = head;    
        while(nn != null)
        {
            ll.add(nn.val);
            nn = nn.next ;
        }

        int j = ll.size()-1;
        int i = 0;
        while(i<j){
            if(ll.get(i)!=ll.get(j))
            return false;

            i++;
            j--;
        }

        return true;
    }
}