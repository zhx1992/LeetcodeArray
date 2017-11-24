class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(list,new ArrayList<Integer>(),candidates,target,0);
        return list;
    }
    private void backTrack(List<List<Integer>> list,List<Integer> templist,int[] nums,int remain,int start) {
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(templist));
        else {
            for(int i = start;i < nums.length;i++) {
                templist.add(nums[i]);
                backTrack(list,templist,nums,remain - nums[i],i);
                templist.remove(templist.size() - 1);
            }
        }
    }
}