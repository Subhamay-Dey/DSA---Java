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
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = head;

        ListNode prev = null;

        while(slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        slow = prev;

        // if(fast.val == slow.val) {
        //     fast = fast.next;
        //     slow = slow.next;
        // }

        while(slow != null) {
            if(slow.val == fast.val) {
                slow = slow.next;
                fast = fast.next;
            } else {
                return false;
            }
        }

        return true;
    }
}