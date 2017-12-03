class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> triangle=new ArrayList<>();
        if(rowIndex<0)
            return triangle;
        for(int i=0;i<=rowIndex;i++) {
            triangle.add(0,1);
            for(int j=1;j<triangle.size()-1;j++)
                triangle.set(j,triangle.get(j)+triangle.get(j+1));
        }
        return triangle;
    }
}