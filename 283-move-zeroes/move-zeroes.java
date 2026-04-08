class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
}
/*
class Solution {
    public void moveZeroes(int[] nums) {
         int index = 0; 
        for (int num : nums) { 
            if (num != 0) { 
                nums[index++] = num; 
            } 
        } 
        while (index < nums.length) { 
            nums[index++] = 0; 
        } 
    }
}
*/