public class Solution {
    public static Node uniqueSortedList(Node head) {
        // Write your code here.
        Node temp=head;
        while(temp!=null&& temp.next!=null){
            Node nn=temp.next;
            while(nn!=null&&nn.data==temp.data){
                nn=nn.next;
            }
            temp.next=nn;
            if(nn!=null) {
                nn.prev=temp;
            }
            temp=temp.next;
        }
        return head;
    }
}
