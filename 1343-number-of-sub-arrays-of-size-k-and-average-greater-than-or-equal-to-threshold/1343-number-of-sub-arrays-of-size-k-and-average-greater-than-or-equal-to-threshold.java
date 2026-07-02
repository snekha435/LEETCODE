class Solution {
    public int numOfSubarrays(int[] a, int k, int t) {
        int cnt=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+a[i];

        }
        int avg=sum/k;
        if(avg>=t) cnt++;
        int st=1,end=k;
        while(end<a.length){
            sum=sum-a[st-1]+a[end];
            avg=sum/k;
            if(avg>=t) cnt++;
            st++;
            end++;
        }
        return cnt;
        
    }
}