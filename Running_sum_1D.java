//Running sum of 1D array

//Solution
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0]=nums[0];
        System.out.print(res[0]);
        for(int i = 1; i < n; i++){
            res[i] = nums[i] + res[i-1];
            System.out.print(res[i]);
        }
        return res;
    }
}
