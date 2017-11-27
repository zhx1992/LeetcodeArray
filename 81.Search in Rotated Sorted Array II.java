class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r) {
            int mid=(l+r)/2;
            if(target==nums[mid]) return true;
            if(nums[l]<nums[mid]) {
                if(nums[l]<=target && nums[mid]>target)
                    r=mid-1;
                else
                    l=mid+1;
            } else if(nums[l]>nums[mid]) {
                if(nums[mid]<target && nums[r]>=target)
                    l=mid+1;
                else
                    r=mid-1;
            } else l++;
        }
        return false;
    }
}