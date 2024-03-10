import java.util.Stack;

 

public class Solution {

    static class Queue {

        // Define the data members(if any) here.

        Stack<Integer> input;

        Stack<Integer> output;

 

        Queue() {

            // Initialize your data structure here.

            input = new Stack<>();

            output = new Stack<>();

        }

 

        void enQueue(int val) {

            // Implement the enqueue() function.

            input.add(val);

        }

 

        int deQueue() {

            // Implement the dequeue() function.

            if (output.isEmpty()) {

                if (input.isEmpty()) {

                    return -1;

                }

                while (!input.isEmpty()) {

                    output.add(input.peek());

                    input.pop();

                }

            }

            return output.pop();

        }

 

        int peek() {

            // Implement the peek() function here.

            if (output.isEmpty()) {

                if (input.isEmpty()) {

                    return -1;

 

                }

                while (!input.isEmpty()) {

                    output.add(input.peek());

                    input.pop();

                }

            }

            return output.peek();

        }

 

        boolean isEmpty() {

            // Implement the isEmpty() function here.

            if (output.isEmpty() && input.isEmpty()) {

                return true;

 

            } else {

                return false;

            }

        }

    }

}
