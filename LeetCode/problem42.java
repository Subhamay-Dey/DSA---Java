package LeetCode;

public class problem42 {

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k == 0 ) return head;

        int size = 1;
        ListNode tail = head;
        while(tail.next != null) {
            size++;
            tail = tail.next;
        }
        tail.next = head;

        k = k % size;

        int index = size - k ;
        int i = 1;
        ListNode prev = head;
        while(i < index) {
            prev = prev.next;
            i++;
        }
        ListNode newhead = prev.next;
        prev.next = null;
        
        return newhead;
    }
}
}
