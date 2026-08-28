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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //dummy node placed before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // move fast n +1 step ahead
        for(int i = 0; i<= n;i++){
            fast = fast.next;
        }

        // move both pointer until fast reaches null
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        // delete nth node from the end
        slow.next = slow.next.next;

        // return actual head
        return dummy.next;
    }
}