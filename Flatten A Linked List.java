//Flatten A Linked List
public class Solution {
    public static Node flattenLinkedList(Node head) {
        //Write your code here
        if(head == null || head.next==null) return head;
        Node dummy = new Node(-1);
        Node end = dummy;
        while(true){
            Node prev = null;
            Node minNode = null;
            int flag = 0;
            Node minPrev = null;
            Node temp = head;
            int min = Integer.MAX_VALUE;
            while(temp!=null){
                flag = 1;
                if(temp.data<min){
                    minPrev = prev;
                    min = temp.data;
                    minNode = temp;
                }
                prev = temp;
                temp = temp.next;
            }
            if(flag == 0) break;
            end.child = minNode;
            end = minNode;
            Node t = minNode.next;
            if(minPrev == null){
                if(head.child!=null){
                    head = head.child;
                    head.next = t;
                }
                else {
                    head = head.next;
                }
            }
            else {
                if(minNode.child!=null){
                    minPrev.next = minNode.child;
                    minNode.child.next = t;
                }
                else {
                    minPrev.next = t;
                }
            }
        }
        return dummy.child;
    }
}
