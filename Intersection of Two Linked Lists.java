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
    public static Node findIntersection(Node ho, Node ht) {
        // Check if either list is empty
        if(ho == null || ht == null){
            return null;
        }

        Node t1 = ho;
        Node t2 = ht;

        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;

            // If the pointers meet, return the intersection point
            if (t1 == t2) {
                return t1;
            }

            // Reset pointers if they reach the end of the list
            if (t1 == null) {
                t1 = ht;
            }
            if (t2 == null) {
                t2 = ho;
            }
        }

        // Return the intersection point
        return t1;
    }
}

