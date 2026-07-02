class Solution {
    public int search(int[] A, int t) {
        int n=A.length; 
        int low=0; 
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(t==A[mid])return mid;
            else if(t>A[mid]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}