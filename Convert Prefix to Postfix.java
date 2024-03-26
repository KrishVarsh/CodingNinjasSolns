import java.util.Stack;

public class Solution {
    public static String preToPost(String s) {

        Stack<String> st = new Stack<>();

        for(int i=s.length()-1;i>=0;i--){

            char ch = s.charAt(i);

            if(Character.isUpperCase(ch))   st.push(ch+"");

            else{
                String a = st.pop();
                String b = st.pop();
                st.push(a+b+ch+"");
            }
        }
        
        return st.pop();
    }
    
}
