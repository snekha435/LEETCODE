class Solution {
    public int[] productExceptSelf(int[] A) {
        int n=A.length;
        int[] pm = new int[n];
        pm[0]=A[0];
        for(int i=1;i<n;i++){
            pm[i]=pm[i-1]*A[i];

        }
        int sm[]=new int[n];
        sm[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--){
            sm[i]=sm[i+1]*A[i];
        }
        int lm,rm;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0) lm=1;
            else lm=pm[i-1];
            if(i==n-1) rm=1;
            else rm=sm[i+1];
            ans[i]=lm*rm;
        }
        return ans;
        
     }
}