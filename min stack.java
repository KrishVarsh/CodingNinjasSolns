import java.util.* ;
import java.io.*; 

public class Solution {

    static class MinStack {

        int min = Integer.MAX_VALUE;
        Stack<Integer> st = null;
        MinStack() {
            st = new Stack<>();
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            if(st.isEmpty()){
                st.push(num);
                min = num;
                return;
            }

            if(num < min){
                int temp = 2*num - min;
                st.push(temp);
                min = num;
            } else {
                st.push(num);
            }
            
        }

        // Function to remove the top element of the stack.
        int pop() {
            if(st.isEmpty()){
                return -1;
            }
            int element = st.pop();
            int temp = 2*min - element;
            if(element < min){
                int ans = min;
                min = temp;
                return  ans;
            } else {
                return element;
            }

        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            if(st.isEmpty()){
                return -1;
            }
            int element = st.peek();
            int temp = 2*min - element;
            if(element < min){
                return  min;
            } else {
                return element;
            }
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            if(st.isEmpty()){
                return -1;
            }
            return min;
        }
    }
}
