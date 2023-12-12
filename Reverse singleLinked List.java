//Reverse Linked List
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

public class Solution
{
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.
        Node temp=head;
        Node last=null;
        while(temp!=null){
            Node front=temp.next;
            temp.next=last;
            last=temp;
            temp=front;

        }
        return last;
    }
}
