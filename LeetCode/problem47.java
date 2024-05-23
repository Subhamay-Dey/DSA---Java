package LeetCode;

public class problem47 {

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;

        ListNode left_side = sortList(head);
        ListNode right_side = sortList(slow);

        return merge(left_side, right_side);
    }

    public ListNode merge(ListNode l1, ListNode l2) {

        ListNode sorted_temp = new ListNode(0);
        ListNode current_node = sorted_temp;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                current_node.next = l1;
                l1 = l1.next;
            } else {
                current_node.next = l2;
                l2 = l2.next;
            }
            current_node = current_node.next;
        }

        if(l1 != null) {
            current_node.next = l1;
            l1 = l1.next;
        }
        if(l2 != null) {
            current_node.next = l2;
            l2 = l2.next;
        }
        return sorted_temp.next;
    }
}
}
