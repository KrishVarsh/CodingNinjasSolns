//Sort linked list of 0s 1s 2s
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
    
 public static Node sortList(Node head) {
     
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        Node zero = new Node(0);
        Node zeropoint = zero;
        Node one = new Node(1);
        Node onepoint = one;
        Node two = new Node(2);
        Node twopoint = two;


        while(temp!=null){

            if(temp.data==0){
                zero.next = temp;
                zero=temp;
               
            }
            else if(temp.data==1){
                one.next=temp;
                one=temp;
               
            }
            else if(temp.data==2){
                two.next=temp;
                two=temp;
               
            }
        temp=temp.next;
            
        }

        zero.next= (onepoint.next!=null) ? (onepoint.next) : (twopoint.next);
        one.next=twopoint.next;
        two.next=null;
        Node newhead=zeropoint.next;

        zeropoint.next=null;
        onepoint.next=null;
        twopoint.next=null;

        return newhead;
    }
}
