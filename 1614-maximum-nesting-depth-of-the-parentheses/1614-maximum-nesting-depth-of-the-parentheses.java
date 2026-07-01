class Solution {
    public int maxDepth(String s) {
        int ob=0,max=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')ob++;
            else if(ch==')')ob--;
            max=Math.max(max,ob);

        }
        return max;
        
    }
}