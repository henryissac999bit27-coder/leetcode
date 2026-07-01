class Solution {
    public int[][] generateMatrix(int n) {
        int left=0,right=n-1;
        int top=0,bottom=n-1;
        int x=1;
        int[][]matrix=new int[n][n];
        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                matrix[top][j]=x++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=x++;
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    matrix[bottom][j]=x++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left]=x++;
                }
                left++;
            }
        }
        return matrix;
    }
}
