import java.util.List;
import java.util.Stack;
import java.util.Collections;
import java.util.ArrayList; 

public class Solution {
    public static List<Integer> collidingAsteroids(int[] asteroids) {

        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        
        // Iterate through each asteroid 
        for (int i = 0; i < n; i++) {
            if (asteroids[i] > 0 || st.empty()) {  
                // Positive asteroid or empty stack: no immediate collision
                st.push(asteroids[i]); 
            } else { 
                // Negative asteroid: collision scenario!
                while (!st.empty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])) { 
                    // Destroy smaller positive asteroids 
                    st.pop(); 
                }

                if (!st.empty() && st.peek() == Math.abs(asteroids[i])) { 
                    // Equal magnitudes: both asteroids destroyed
                    st.pop(); 
                } else { 
                    // Negative asteroid survives if no more positive collisions,
                    // or if the top stack element is non-positive
                    if (st.empty() || st.peek() <= 0) { 
                        st.push(asteroids[i]);
                    } 
                }
            }
        }

    List<Integer> ans = new ArrayList<>(); 
    while (!st.empty()) {
        ans.add(st.pop());  // Pop and add to preserve order
    }

    Collections.reverse(ans); // Reverse the result

    return ans;
    }
}
