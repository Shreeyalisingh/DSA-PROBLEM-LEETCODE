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
import java.util.PriorityQueue;
// Imports required by the testing environment for parsing JSON input.
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonValue;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    /**
     * This is the missing helper method that the testing environment needs.
     * It converts a JsonArray (e.g., [1, 4, 5]) into a linked list (1->4->5).
     */
    public static ListNode arrayToListNode(JsonArray arr) {
        if (arr == null || arr.isEmpty()) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (JsonValue val : arr) {
            current.next = new ListNode(val.asInt());
            current = current.next;
        }
        return dummy.next;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        
        for (ListNode listHead : lists) {
            if (listHead != null) {
                minHeap.add(listHead);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (!minHeap.isEmpty()) {
            
            ListNode smallestNode = minHeap.poll();

            
            tail.next = smallestNode;
            tail = tail.next;

        
            if (smallestNode.next != null) {
                minHeap.add(smallestNode.next);
            }
        }

        return dummy.next;
    }
}