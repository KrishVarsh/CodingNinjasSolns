//elete Middle Node
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
 };

 *****************************************************************/
import java.util.*;
public class Solution {
    public static Node deleteMiddle(Node head) {
        // Write your code here.
        if(head == null || head.next == null){

return null;

}
        Node slow=head;
        Node fast=head;
        fast=fast.next.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        } 
        slow.next=slow.next.next;
        return head;

    }
}
