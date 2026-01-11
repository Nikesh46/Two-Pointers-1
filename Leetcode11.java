// TC - O(n)
// SC - O(1)
class Solution {
    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int max = -1;

        while (i < j) {
            int least = Math.min(height[i], height[j]);
            int area = (j - i) * least;
            max = Math.max(max, area);
            if (height[i] > height[j]) {
                j--;
            } else if (height[i] == height[j]) {
                j--;
                i++;
            } else {
                i++;
            }

        }

        return max;

    }
}