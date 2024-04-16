import java.util.Stack;

 

public class Solution {

    public static String removeKDigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        

        for (int i = 0; i < num.length(); i++) {

            while (!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)) {

                st.pop();

                k--;

            }

            st.push(num.charAt(i));

        }

        

        while (!st.isEmpty() && k > 0) {

            st.pop();

            k--;

        }

        

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {

            char ch = st.pop();

            ans.append(ch);

        }

        

        ans.reverse();

        

        int j = 0;

        while (j < ans.length() && ans.charAt(j) == '0') {

            j++;

        }

        

        if (j != 0 && j < ans.length()) {

            return ans.substring(j);

        }

        

        if (j == ans.length()) {

            return "0";

        }

        

        return ans.toString();

    }

}

 
