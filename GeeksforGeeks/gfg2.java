package GeeksforGeeks;

public class gfg2 {

    // Node of a linked list

    class Node {
    int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }

class Solution
{
    int getMiddle(Node head)
    {
        Node fast = head;
        Node slow = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
}
