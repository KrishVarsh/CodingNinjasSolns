public class Solution extends Queue{

    Node response = new Node(0);
    Node temp = response;
    public void push(int x) {
        temp.next = new Node(x);
        temp = temp.next;
    }

    public int pop() {
        if(response.next == null){
            return -1;
        }

        Node next = response.next;
        response.next = next.next;
        if(next.next == null){
            temp = response;
        }
        return next.data;
    }
}
