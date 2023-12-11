// Segrregate odd and even nodes in LL
leetcode
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
    public ListNode oddEvenList(ListNode head) {
        // Edge case: if the list is empty or has only one element, return as is
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize pointers for odd and even nodes
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next; // Save the head of the even list for later

        // Iterate through the list, rearranging nodes into odd and even positions
        while (even != null && even.next != null) {
            odd.next = odd.next.next; // Skip one node for odd position
            even.next = even.next.next; // Skip one node for even position
            odd = odd.next;
            even = even.next;
        }

        // Connect the odd list with the even list
        odd.next = evenHead;

        return head; // Return the modified list
    }
}


Ninjas
public ListNode oddEvenList(ListNode head) {
        //edge case
        if(head==null || head.next==null) return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=head.next;
        while(even !=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next; 
        }
        odd.next=evenHead;
        return head;
        
    }
}

