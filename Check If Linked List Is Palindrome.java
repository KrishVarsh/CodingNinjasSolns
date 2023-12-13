 // Check If Linked List Is Palindrome
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    //reversal
    public static Node reverseit(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node nh=reverseit(head.next);
        Node front= head.next;
        front.next=head;
        head.next=null;
        return nh;
    }
    //palindrome
    public static boolean isPalindrome(Node head) {
        // write your code here
        if(head==null||head.next==null) return true;
       Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        } 
        Node noh=reverseit(slow.next);
        Node first=head;
        Node second=noh;
        while(second!=null){
            if(first.data!=second.data){
                reverseit(noh);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverseit(noh);
        return true;
    }
}
