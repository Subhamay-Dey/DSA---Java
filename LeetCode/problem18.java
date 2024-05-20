package LeetCode;

public class problem18 {

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        // ListNode next = head.next;

        // while(head != null && next != null) {

        //     if(head.val != next.val) {
        //         head = next;
        //     } else {
        //     head.next = head.next.next;
        //     }
        // }
        // return head;

        if(head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while(current != null && current.next != null) {
            if(current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
}
