class Solution {
    public int[] replaceElements(int[] a) {
        int max=-1;
        for(int i=a.length-1;i>=0;i--){
            int val =a[i];
            a[i]=max;
            max=Math.max(max,val);
        }
        return a;
        
    }
}