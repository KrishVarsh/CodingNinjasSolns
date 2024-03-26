import java.util.Stack;

 

public class Solution {

    public static String postfixToPrefix(String exp) {

        // Write your code here

        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            if (Character.isLetterOrDigit(exp.charAt(i))) {

                st.push(exp.charAt(i) + "");

            } else {

                String A = st.peek();

                st.pop();

                String B = st.peek();

                st.pop();

 

                st.push(exp.charAt(i) + B + A);

            }

        }

 

        return st.peek();

    }

}
