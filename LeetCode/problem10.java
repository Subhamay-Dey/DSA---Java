package LeetCode;

public class problem10 {
    
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(0);
        int carry = 0;
        ListNode head = temp;

        while(l1 != null || l2 != null){
            if(l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(carry % 10);
            temp = temp.next;
            carry = carry / 10;
        }
        if(carry == 1) {
            temp.next = new ListNode(1);
            // temp = temp.next;
        }

        return head.next;

    }
}
}