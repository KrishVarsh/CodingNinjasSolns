//Print Fibonacci Series
public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        int[] fibArray = new int[n];
        generateFibonacciNumbersHelper(n, fibArray);
        return fibArray;
    }

    private static void generateFibonacciNumbersHelper(int n, int[] fibArray) {
        if (n <= 0) {
            return;
        }

        if (n == 1) {
            fibArray[0] = 0;
        } else if (n == 2) {
            fibArray[0] = 0;
            fibArray[1] = 1;
        } else {
            generateFibonacciNumbersHelper(n - 1, fibArray);
            fibArray[n - 1] = fibArray[n - 2] + fibArray[n - 3];
        }
    }
}

// //for simgle no
// public class Solution {
//     public static int[] generateFibonacciNumbers(int n) {
//         // Write your code here.
//         if(n<=1) return n;
//         int last=generateFibonacciNumbers(n-1);
//         int slast=generateFibonacciNumbers(n-2);
//         return last+slast;

//     }
// }
