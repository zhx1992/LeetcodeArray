class Solution {
    public void sortColors(int[] nums) {
        int low=0,high=nums.length-1;
        for(int i=low;i<=high;) {
            if(nums[i]==0) {
                int temp=nums[i];
                nums[i]=nums[low];
                nums[low]=temp;
                low++;
                i++;
            } else if(nums[i]==2) {
                int temp=nums[i];
                nums[i]=nums[high];
                nums[high]=temp;
                high--;
            } else 
                i++;
        }
    }
}