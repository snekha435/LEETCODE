class Solution {
    public int maxSubArray(int[] A) {
        int sum=0;
        int max=A[0];
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
        return max;
    }
}