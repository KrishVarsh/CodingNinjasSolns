// Merge Sort
import java.util.ArrayList;

public class Solution {

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l >= r) return;

        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);  // Sort the left half
        mergeSort(arr, mid + 1, r);  // Sort the half

        merge(arr, l, mid, r);  // Merge both left & right sorted halves
    }

    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); // to temporary store the elements
        int left = low; // starting index of the left half of the array
        int right = mid + 1; // starting index of the right half of the array

        // Till then elements are exists in both left & right half of the array
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        // Left elements (If) in left half of the array
        while(left <= mid){
            temp.add(arr[left++]);
        }

        // Left elements (If) in right half of the array
        while(right <= high){
            temp.add(arr[right++]);
        }

        // Transfering all elements from temp to arr
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }
}
