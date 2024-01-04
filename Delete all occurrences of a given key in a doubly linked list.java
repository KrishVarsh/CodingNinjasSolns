//Delete all occurrences of a given key in a doubly linked list
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
     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 }

 *****************************************************************/

public class Solution {
    public static Node deleteAllOccurrences(Node head, int key) {
        // Write your code here.
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                if(temp==head){
                    head=head.next;
                }
                Node nn=temp.next;
                Node pn=temp.prev;
                if(nn!=null){
                    nn.prev=pn;
                }
                if(pn!=null){
                    pn.next=nn;
                }
                temp=nn;
            }
            else{
                temp=temp.next;
            }
            
        }
        return head;
    }
}
