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
    public ListNode middleNode(ListNode head) {
        // slow move 1 step at time
        ListNode slow = head;
        // fast move 2 step at time
        ListNode fast = head;

        // continue until fast reaches the end
        while(fast != null && fast.next != null){
            slow = slow.next; // slow move by 1 node
            fast = fast.next.next; // fast move by 2 node
        }
        // when fast reaches the end , slow will be pointing at middle
        return slow;
        
    }
}