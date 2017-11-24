class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backTracing(list,new ArrayList<Integer>(),nums,0);
        return list;
    }
    private void backTracing(List<List<Integer>> list,List<Integer> tempList,int[] nums,int n) {
        list.add(new ArrayList<>(tempList));
        for(int i=n;i<nums.length;i++) {
            tempList.add(nums[i]);
            backTracing(list,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}