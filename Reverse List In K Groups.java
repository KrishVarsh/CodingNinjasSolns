public class Solution {
    public static Node reverse(Node head) {
        if (head.next == null || head == null) {
            return head;
        }

        Node newHead = reverse(head.next);
        newHead.next = head;
        head.next = null;
        return head;
    }

    public static Node findKthNode(Node temp, int k) {
        k = k - 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public static Node kReverse(Node head, int k) {
        Node temp = head;
        Node prevNode = null;

        while (temp != null) {
            Node kThNode = findKthNode(temp, k);

            if (kThNode == null) {
                if (prevNode != null) {
                    prevNode.next = temp;
                }
                break;
            }

            Node nextNode = kThNode.next;
            kThNode.next = null;
            reverse(temp);

            if (temp == head) {
                head = kThNode;
            } else {
                prevNode.next = kThNode;
            }

            prevNode = temp;
            temp = nextNode;
        }

        return head;
    }
}
