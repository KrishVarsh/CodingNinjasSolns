import java.util.Arrays;

public class Solution {
    public static String commonPrefix(String[] arr, int n) {

        StringBuilder ans = new StringBuilder();
        Arrays.sort(arr);
        String first = arr[0];  //First element of the sorted array
        String last = arr[arr.length - 1]; //Last element of the sorted array



        /*We compare the characters of the first element with the last element 
          one by one. If a common character is found , we push it to the 'ans'
        */
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                ans.append(first.charAt(i));
            }else{
                break;
            }  
        }

        if (ans.length() == 0) {
            return "-1";
        } else {
            return ans.toString();
        }
    }

}
