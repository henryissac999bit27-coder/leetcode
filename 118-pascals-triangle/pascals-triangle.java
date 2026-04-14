class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mat=new ArrayList<>();
        for(int row=0;row<numRows;row++){
            List<Integer> arr=new ArrayList<>();
            for(int j=0;j<=row;j++){
                if(j==0||j==row){
                    arr.add(1);
                }
                else{
                    arr.add(mat.get(row-1).get(j-1)+mat.get(row-1).get(j));
                }
            }
            mat.add(arr);
        }
        return mat;
    }
}