class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minl =3000,minw=3000,res=3000;
        int n=landStartTime.length;
        int m=waterStartTime.length;
        
        for (int i=0;i<n;i++){
            minl=Math.min(minl,landStartTime[i]+landDuration[i]);
        }

        for (int i=0;i<m;i++){
            minw=Math.min(minw,waterStartTime[i]+waterDuration[i]);
            res=Math.min(res,Math.max(minl,waterStartTime[i])+waterDuration[i]);
        }

        for (int i=0;i<n;i++){
            res=Math.min(res,Math.max(minw,landStartTime[i])+landDuration[i]);
        }
        return res;
    }
}