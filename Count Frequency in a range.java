// Count Frequency in a range
public class Solution {

    public static int[] countFrequency(int n, int x, int[] nums) {
        // Create a HashMap to store frequency of each element
        Map<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element in the input array
        for (int i = 0; i < n; i++) {
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);
        }

        // Create an array to store the frequencies of numbers from 1 to x
        int[] ans = new int[x];

        // Populate the array with frequencies
        for (int i = 0; i < x; i++) {
            ans[i] = map.getOrDefault(i + 1, 0);
        }

        return ans;
    }
