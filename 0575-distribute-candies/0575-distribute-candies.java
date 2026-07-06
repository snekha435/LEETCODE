class Solution {
    public int distributeCandies(int[] A) {
        int n=A.length/2;
        HashSet<Integer>hs=new HashSet<>();
        for(int df:A){
            hs.add(df);
        }
        int df_size=hs.size();
        int min=Math.min(n,df_size);
        return min;
        
    }
}