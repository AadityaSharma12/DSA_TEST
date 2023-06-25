package Technicaljava;
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;  
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}
public class Question1 {
    public static void main(String[] args) {
         int[] nums = {6,0, 7,0, 0, 3, 15};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}
