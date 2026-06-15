/*class Solution {
    public int findDuplicate(int[] nums) {
        HashSet <Integer> set= new HashSet<>();
        int dup=0;
        for(int num:nums){
            if(!set.add(num)){
                dup=num;
            }
        }
        return dup;        
    }
}*/
public class Solution {
    public int findDuplicate(int[] nums) {
        // Create a frequency array to track occurrences
        int[] freq = new int[nums.length];
        
        // Traverse the input array
        for (int num : nums) {
            // If the number has been seen before, it's the duplicate
            if (freq[num] == 1) {
                return num;
            }
            // Mark the number as seen
            freq[num]++;
        }
        
        return -1; // Fallback value
    }
}