class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int []a=new int[m+n];
        for(int i=0;i<m;i++){
            a[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            a[m+j]=nums2[j];
        }
        Arrays.sort(a);
        int y=a.length;
        if(y%2==0){
            double x=(a[y/2]+a[y/2-1])/2.0;
            return x;
        }
        else{
            return a[y/2];
        }               
    }
}