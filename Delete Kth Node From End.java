// Delete Kth Node From End
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node removeKthNode(Node head, int k)
    {
        // Write your code here.
        Node fast=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        Node slow=head;
        if(fast==null) return head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;

        }
        Node delnode=slow.next;
        slow.next=slow.next.next;
        return head;
    }
}
