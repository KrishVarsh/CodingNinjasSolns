 // Reverse A Doubly Linked List
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
    public static Node reverseDLL(Node head)
    {
        // Write your code here.
        if(head==null||head.next==null){
            return head;
        }
        Node last= null;
        Node cur=head;
        while(cur!=null){
            last=cur.prev;
            cur.prev=cur.next;
            cur.next=last;
            cur=cur.prev;
        }
        //last.prev=head;
        return last.prev;
    }
}
