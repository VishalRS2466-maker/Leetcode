class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans =new int[2*n];
        for (int i=0 ; i<n ; i++) //Error possibility i<2*n is wrong since nums is of length n it can't expand since there is no elements after nin nums
        { 
            ans[i]=nums[i];//1st half
            ans[i+n] = nums[i];//2nd half
        }
        return ans;
    }
}

/* O(n)  class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }
}   */        
            