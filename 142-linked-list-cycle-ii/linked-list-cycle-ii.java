/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                // reset slow pointer at head position
                //  move both pointer one step at time
                slow = head;
                // when both pointe meet it will be starting node index of cycle
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }

                // slow and fast are at the beginning of cycle
                return slow;
            }
        } 
        return null;
        
    }
}