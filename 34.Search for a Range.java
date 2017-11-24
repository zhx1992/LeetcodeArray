class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0,hi = nums.length -1;
        int[] res = new int[2];
        if(nums == null || nums.length == 0)
            return new int[]{-1,-1};
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if(target > nums[mid])
                lo = mid + 1;
            else
                hi = mid;
        }
        if(target == nums[lo])
            res[0] = lo;
        else
            res[0] = -1;
        hi = nums.length - 1;
        while(lo < hi) {
            int mid = (lo + (hi - lo) / 2) + 1;
            if(target < nums[mid])
                hi = mid - 1;
            else
                lo = mid;
        }
        if(target == nums[hi])
            res[1] = hi;
            else
                res[1] = -1;
        return res;
    }
}