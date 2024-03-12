/****************************************************************

 Following is the class structure of the Node class:

 static class Node
 {
     int data;
     Node next;
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
public class Solution {
    static class Stack {
        static Node head;

        static int size;

 

        Stack(){

           head = null;

           size = 0;

       }

 

         int getSize(){

           return size;

       }

 

         boolean isEmpty(){

           return head==null;

       }

 

         void push(int data){

           Node temp = new Node(data);

           temp.next = head;

           size++;

           head = temp;

       }

 

          int pop(){

           if(head==null){

               return -1;

           }

           int val = head.data;

           size--;

           head = head.next;

           return val;

       }

 

         int getTop(){

           if(head==null){

               return -1;

           }

           return head.data;

       }

    }
}
