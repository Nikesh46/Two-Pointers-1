// TC - O(n)
// SC - O(1)
// Using 3 pointers left, mid and right such that everything towards the left of 'left' index is 0's and everything at the right of 'right' index is 2's and mid pointer is used to iterate over the array to compare with left and right based on its value 
class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (mid <= right) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                mid++;
                left++;

            } else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                mid++;
            }
        }
    }
}