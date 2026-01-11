class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Solution 1
        // TC : O(n^2)
        // SC : O(1)
        // int n = nums.length;
        // Arrays.sort(nums);
        // List<List<Integer>> res = new ArrayList<>();
        // // System.out.println(Arrays.toString(nums));
        // for(int i =0; i <= n-3; i++) {
        // // System.out.println(i);
        // if (i>0 && nums[i] == nums[i-1]) {
        // continue;
        // }
        // if(nums[i] > 0) {
        // return res;
        // }

        // int left = i+1;
        // int right = n-1;
        // while(left<right) {
        // int sum = nums[i] + nums[left] + nums[right];

        // if(sum == 0 ) {
        // res.add(Arrays.asList(nums[i], nums[left], nums[right]));
        // // System.out.println(res);
        // left++;
        // right--;
        // while(left<right && nums[left] == nums[left-1]) left++;
        // while(left<right && nums[right] == nums[right+1]) right--;
        // }
        // else if(sum< 0) {
        // left++;
        // } else {
        // right--;
        // }

        // }
        // }
        // return res;

        // Solution 2
        // TC - O(n^2)
        // SC - O(n)
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i <= n - 3; i++) {
            int target = -nums[i];
            Set<Integer> currSet = new HashSet<>();

            for (int j = i + 1; j <= n - 1; j++) {
                if (!currSet.contains(target - nums[j])) {
                    currSet.add(nums[j]);
                } else {
                    List<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[j], target - nums[j]));
                    triplet.sort(null);
                    set.add(triplet);
                }
            }
        }
        res.addAll(set);

        return res;

    }
}