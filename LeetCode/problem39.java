package LeetCode;

public class problem39 {

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     if(head == null || head.next == null) return null;

     int size = 0;
     ListNode current = head;
     while(current != null) {
        current = current.next;
        size++;
     }

     if(size == n) return head.next;

     int IndexToSearch = size - n;
     ListNode prev = head;
     int i = 1;
        while(i < IndexToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

        return head;
    }
}
}
