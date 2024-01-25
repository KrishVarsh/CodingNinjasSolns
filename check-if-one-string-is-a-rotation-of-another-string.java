public class Solution {
    public static int isCyclicRotation(String A, String B){
        if(A == null || B == null || A.length() != B.length())
            return 0;
        if(A.length() == 0)
            return 1;
        
        char start = A.charAt(0);
        
        for(int i = 0; i < B.length(); i++) { 
				
            int j = i;
            while(j < B.length() && B.charAt(j) != start)
                j++;
            
            if(j >= B.length()) 
                return 0;
            
            for(int n = 0; n < B.length(); n++) {
                if(A.charAt(n) != B.charAt((n + j) % B.length()))
                    break;
                if(n == B.length() - 1)
                    return 1;
            }
            
           i = j;
        }
return 0;
}}
