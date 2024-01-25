import java.util.ArrayList;

public class Solution { 

   public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {

        int p1 = 0, p2 = 0, counter = 0, answer = 0;

       while (p1 < n && p2 < m) {

            if (counter == k) break;

            if (arr1.get(p1) < arr2.get(p2)) { 

               answer = arr1.get(p1);

                ++p1;

            } else { 

               answer = arr2.get(p2); 

               ++p2; 

           } 

           ++counter; 

       }

       // Check if kth element is found 

       if (counter != k) {

            // If elements remaining in arr1

            if (p1 < n)

                answer = arr1.get(p1 + k - counter - 1); 

           // If elements remaining in arr2

            else 

               answer = arr2.get(p2 + k - counter - 1);

        }

       return answer; 

   }

 }  
